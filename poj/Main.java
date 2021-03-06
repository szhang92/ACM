import java.util.*;
import java.math.*;
import java.io.*;
import java.awt.Point;

import static java.util.Arrays.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Long.*;
import static java.lang.Short.*;
import static java.lang.Math.*;
import static java.math.BigInteger.*;
import static java.util.Collections.*;

public class Main {

	private Scanner in;
	private StringTokenizer st;
	private PrintWriter out;

	public void solve() throws Exception {
		int[] line = new int[10001];
		fill(line, 0);
		line[0] = -1;

		while(in.hasNext()) {
			int l = in.nextInt();
			int h = in.nextInt();
			int r = in.nextInt();

			for(int i=l ; i<r && i < line.length; i++){
				line[i] = max(h, line[i]);
			}
		}

		String ans = "";

		for(int i=1; i<line.length; i++){
			if(line[i] != line[i-1]){
				ans += i + " " + line[i] + " ";
			}
		}

		out.println(ans.trim());
	}

	public Main() {
		this.in = new Scanner(System.in);
		this.out = new PrintWriter(System.out);
	}

	public void end() {
		try {
			this.out.flush();
			this.out.close();
			this.in.close();
		} catch (Exception e){
			//do nothing then :)
		}
	}

	public static void main(String[] args) throws Exception {
		Main solver = new Main();
		solver.solve();
		solver.end();
	}
}
