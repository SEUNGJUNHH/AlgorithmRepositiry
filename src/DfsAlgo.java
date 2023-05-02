import java.util.Scanner;
import java.util.Stack;

public class Main {
    //임의로 잡아놓은 값, 문제에 해결 및 배열의 크기에 따라 해당 값은 변경될 수 있다.
    static final int MAX = 10;
    //node와 edge표현을 위한 10*10 배열 생성. 해당 배열을 기반으로 서치를 진행한다.
    static int[][] doubleArray = new int[MAX][MAX];
    static int NODE,EDGE;
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        //node와 edge의 수를 입력받는다.
        NODE = scanner.nextInt();
        EDGE = scanner.nextInt();
        for (int i = 0; i < EDGE; ++i) {
            //노드간 연결되어있는 연결관게를 입력받는다.
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            //양방향 연결관계를 표현할 것 임으로 양쪽 모두 체크를 한다.우린 1과 그 외로 연결관계를 구분할 것이다.
            doubleArray[node1][node2]=doubleArray[node2][node1]=1;
        }
        //root노드 0번부터 시작할 것임으로 0을 출력
        dfs(0);
    }

    private static void dfs(int node) {
        //방문한 노드를 체크하기 위한 배열 생성
        boolean[] checkNode = new boolean[MAX];
        Stack<Integer> stack = new Stack<>();
        //stack에 초기 노드를 넣어주고 본격 탐색에 돌입한다.
        stack.push(node);
        while (!stack.empty()){
            //pop한 노드를 nowNode로 들고있는다
            int nowNode = stack.pop();
            //check배열에 true로 존재(방문한)노드는 탐색하지 않고 continue로 다시 올라간다.
            if(checkNode[nowNode]) continue;
            //탐색하지 않는 노드는 true로 변경시켜준다.
            checkNode[nowNode]=true;
            System.out.println(nowNode+" ");
            //i로 현재 노드와 연결되어있는 다음 노드를 찾는다.
            for (int i = 0; i<NODE; ++i) {
                //방문하지 않았고 연결관계가 있는 노드를 찾고 해당 노드를 스택에 push해준다.
                if(!checkNode[i]&&doubleArray[nowNode][i]!=0)
                    stack.push(i);
            }
        }

    }


}
