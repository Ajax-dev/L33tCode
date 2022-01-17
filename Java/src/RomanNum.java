public class RomanNum {
        public int romanToInt(String s) {
            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                switch(s.charAt(i)) {
                    case 'I':
                        //unsure why this isn't working but now pushing
                        if (s.length() - 1 != i) {
                            System.out.println((s.length() -1) + " " + i);
                            if (s.charAt(i + 1) == 'V') {
                                total += 4;
                                i++;
                            } else if (s.charAt(i + 1) == 'X') {
                                total += 9;
                                i++;
                            }
                        } else {
                            total += 1;
                        }
                        break;
                    case 'V':
                        total += 5;
                        break;
                    case 'X':
                        if(s.charAt(i+1) == 'L') {
                            total += 40;
                            i++;
                        } else if (s.charAt(i+1)=='C') {
                            total += 90;
                            i++;
                        } else {
                            total += 10;
                        }
                        break;
                    case 'L':
                        total += 50;
                        break;
                    case 'C':
                        if(s.charAt(i+1) == 'D') {
                            total += 400;
                            i++;
                        } else if (s.charAt(i+1)=='M'){
                            total += 900;
                            i++;
                        } else {
                            total += 100;
                        }
                        break;
                    case 'D':
                        total += 500;
                        break;
                    case 'M':
                        total += 1000;
                        break;
                }
            }
//            for (int i = 0; i < s.length(); i++) {
//                switch(s.charAt(i)) {
//                    case 'I':
//                        total += 1;
//                        break;
//                    case 'V':
//                        total += 5;
//                        break;
//                    case 'X':
//                        total += 10;
//                        break;
//                    case 'L':
//                        total += 50;
//                        break;
//                    case 'C':
//                        total += 100;
//                        break;
//                    case 'D':
//                        total += 500;
//                        break;
//                    case 'M':
//                        total += 1000;
//                        break;
//                }
//            }

            return total;
        }
}
