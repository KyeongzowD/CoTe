import java.util.*;
import java.io.*;

public class Main {
  static int N,M;
  static boolean[] visited;
  static int[] arr;
  static StringBuilder sb=new StringBuilder();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st=new StringTokenizer(br.readLine());
    N=Integer.parseInt(st.nextToken());
    M=Integer.parseInt(st.nextToken());
    visited=new boolean[N];
    arr=new int[M];

    dfs(0);

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
    
  }

  static void dfs(int depth){//depth가 M의 길이까지
    if(depth==M){
      for(int i=0;i<M;i++){
        sb.append(arr[i]).append(" ");
      }
      sb.append('\n');
      return;
    }
    for(int i=0;i<N;i++){
      if(!visited[i]){
        visited[i]=true;
        arr[depth]=i+1;
        dfs(depth+1);
        visited[i]=false;
      }
    }
  }
}