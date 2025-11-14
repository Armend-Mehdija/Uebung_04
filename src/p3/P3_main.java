package p3;

public class P3_main {
	public static void main (String[] args) {
		boolean x1 = true, x2 = true, x3 = false, x4 = false, y1 = true, y2 = false, y3 = true, y4 = false; 
	    if (!(x1 != y1 && x1 == y1)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (!(x2 != y2 && x2 == y2)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (!(x3 != y3 && x3 == y3)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }	
	    if (!(x4 != y4 && x4 == y4)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x1 || true) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x2 || true) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x3 || true) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x4 || true) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x1 && false) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x2 && false) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x3 && false) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x4 && false) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x1&&!y1 || (!x1)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x2&&!y2 || (!x2)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x3&&!y3 || (!x3)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	    if (x4&&!y4 || (!x4)) {
	    	System.out.println("true");
	    } else {
	    	System.out.println("false");
	    }
	}
}
