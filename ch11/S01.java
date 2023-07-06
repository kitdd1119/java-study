package ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class S01 {
    public static void main(String[] args) {
        // List은 순서가 있고 데이터 중복이 가능하다.
        List list = new ArrayList<>();
        // Set은 순서가 없고 데이터 중복이 불가능하다.
        // key만으로 이루어져 있다.
        Set set = new HashSet<>();
        // Map은 순서가 없고 key, value로 이루어져 있다.
        // key는 중복이 불가능하고 value는 중복이 가능하다.
        Map map = new HashMap<>();
        // Stack은 나중에 들어온 값이 먼저 나간다.
        Stack stack = new Stack<>();
        // Queue은 먼저 들어온 값이 먼저 나간다.
        Queue queue = new LinkedList<>();

        
    }
}
