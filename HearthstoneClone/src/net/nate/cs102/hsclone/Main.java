package net.nate.cs102.hsclone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main	{
public static void main (String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
	System.out.println("Welcome to Hearthpebble\n");
	System.out.println("Select your Hero\n1. Rogue\n2. Shaman\n3.Paladin");
	String select = br.readLine();
	}
}
