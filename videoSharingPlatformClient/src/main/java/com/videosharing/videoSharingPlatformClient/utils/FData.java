package com.videosharing.videoSharingPlatformClient.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FData {
    private static final Random rand = new Random();
    private static final List<String> names = Arrays.asList("Max", "Dave", "Chris", "Carl", "Kirill");
    private static final List<String> emails = Arrays.asList("test1@gmail.com", "test2@gmail.com", 
    														 "test3@mail.ru", "test4@mail.ua", "test5@gmail.com");
    private static final List<String> roles = Arrays.asList("role1", "role2", "role3");
    private static final List<String> passwords = Arrays.asList("12345Test", "Qwerty123", "Pa55word", "CheckThisPassword123");
    private static final List<String> videoNames = Arrays.asList("First video", "Second video", "UFO over LA", "Minecraft let's play");
    
    
    public static String getName() {
    	return names.get(rand.nextInt(names.size()));
    }

    public static String getEmail() {
    	return emails.get(rand.nextInt(emails.size()));
    }

    public static String  getRole() {
        return roles.get(rand.nextInt(roles.size()));
    }
    
    public static String  getPassword() {
        return roles.get(rand.nextInt(passwords.size()));
    }
    
    public static String getVideoName() {
    	return videoNames.get(rand.nextInt(videoNames.size()));
    }

    public static double getCpm() {
    	return rand.nextDouble() * 20;
    }

    public static double getBudget() {
    	return rand.nextDouble() * 1000.0;
    }

    public static double getBalance() {
    	return rand.nextDouble() * 10000.0;
    }
    
    public static boolean getAllowed() {
    	return rand.nextBoolean();
    }
}