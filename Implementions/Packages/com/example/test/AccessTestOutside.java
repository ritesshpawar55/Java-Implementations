package com.example.test;

import com.example.access.PublicClass;

public class AccessTestOutside {
    public static void main(String[] args) {

        PublicClass pub = new PublicClass();
        pub.showPublicMessage();

        System.out.println();

        // PackagePrivateClass pkg = new PackagePrivateClass();
        // pkg.showPackagePrivateMessage();
    }
}