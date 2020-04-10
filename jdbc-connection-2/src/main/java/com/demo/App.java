package com.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.demo.factory.MyConnectionFactory;
import com.demo.model.Image;
import com.demo.service.ImageService;
import com.demo.service.ImageServiceImpl;

public class App 
{
	private ImageService imageservice;
	private static Scanner scanner = new Scanner(System.in);

	{
		imageservice = new ImageServiceImpl();
	}
    public static void main( String[] args )
    {
    	
    	MyConnectionFactory factory,factory1=null;
    	factory=MyConnectionFactory.getConnectionObject();
    	try {
			Connection connection=factory.getMyConnection();
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		int choice = 0;
		App app=new App();

		do {
			System.out.println("1. Add image");
			System.out.println("2. Show all images.");
			System.out.print("chose your choice: ");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter image id: ");
				String imageId = scanner.next();
				System.out.print("Enter image url: ");
				String imageUrl = scanner.next();
				System.out.print("Enter image is available or not: ");
				boolean isAvailable = scanner.nextBoolean();
				app.imageservice.addImage(new Image(imageId,imageUrl,isAvailable));
				break;
			case 2:
				List<Image> list= app.imageservice.getAllImages();
				for(Image image:list)
				{
					System.out.println(image);
				}
				break;
			case 0:
				System.out.println("bye.!!!!!");
				System.exit(0);
				break;
			default:
				break;
			}

		} while (choice != 0);
       
       
       
    }
}
