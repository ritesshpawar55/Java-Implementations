package com.example.acc;

import com.example.access.PackagePrivateClass;
import com.example.access.PublicClass;

public class AccessTest {
	public static void main(String[] args) {
		
		PublicClass p = new PublicClass();
		p.showPublicMessage();
		
//		PackagePrivateClass pp = new PackagePrivateClass();
//		pp.showPackagePrivateMessage();
	}
}

  