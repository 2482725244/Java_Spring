package com.jk;

 import java.io.IOException;
 import java.util.*;
 import javax.servlet.ServletException;
 import javax.servlet.http.*;
 //1. 将用户购买的图书信息保存到Session对象中。
 //2. 在用户购买图书结束后，将页面重定向到用户已经购买的图书列表。
 public class PurchaseServlet extends HttpServlet {
 	private static final long serialVersionUID = 1L;
 	public void doGet(HttpServletRequest req, HttpServletResponse resp)
 			throws ServletException, IOException {
 			// 获得用户购买的商品
 			String id = req.getParameter("id");
 			if (id == null) {
 				// 如果id为null，重定向到ListBookServlet页面
 				String url = "/bookList/servlet/ListBookServlet";
 				resp.sendRedirect(url);
 				return;
 			}
 			Book book = BookDB.getBook(id);
 			// 创建或者获得用户的Session对象
 			HttpSession session = req.getSession();
 			// 从Session对象中获得用户的购物车
 			List<Book> cart = (List) session.getAttribute("cart");
 			if (cart == null) {
 				// 首次购买，为用户创建一个购物车(List集合模拟购物车)
 				cart = new ArrayList<Book>();
 				// 将购物城存入Session对象
 				session.setAttribute("cart", cart);
 			}
 			// 将商品放入购物车
 			cart.add(book);
 			// 创建Cookie存放Session的标识号   即使用户关闭了浏览器，重新打开浏览器访问这个页面时，服务器也能找到之前的session对象。
 			Cookie cookie = new Cookie("JSESSIONID", session.getId());
 			cookie.setMaxAge(60 * 30);
 			cookie.setPath("/BookCart");
 			resp.addCookie(cookie);
 			// 重定向到购物车页面
 			String url = "/bookList/servlet/CartServlet";//将购买的所有图书添加到购物车中，通过session对象传递到
// 			resp.sendRedirect(url);
 			String newurl=resp.encodeRedirectURL(url);
 			resp.sendRedirect(newurl);

 		}
 	}

