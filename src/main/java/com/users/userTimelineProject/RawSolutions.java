package com.users.userTimelineProject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RawSolutions {

    //      static boolean checkBlanagrams(String word1, String word2) {
//		int count = 0;
//		List<String> str1 = new ArrayList<>(Arrays.asList(word1.split(" ")));
//		List<String> str2 = new ArrayList<>(Arrays.asList(word2.split(" ")));
//		if (str1.size() == str2.size()) {
//			for (String s : str1) {
//				for (int i = 0; i < str2.size(); i++) {
//					if (s.length() == str2.get(i).length()) {
//						List<String> listWord1 = new ArrayList<>(Arrays.asList(s.split("")));
//						List<String> listWord2 = new ArrayList<>(Arrays.asList(str2.get(i).split("")));
//
//						Collections.sort(listWord1);
//						Collections.sort(listWord2);
//
//						boolean anagram = word1.equals(word2);
//						if (anagram) {
//							count++;
//							str2.remove(str2.get(i));
//						}
//					}
//				}
//			}
//		}
//		if (count == str1.size()) return true;
//
//		return false;
//	}


//	public static int find(String need, String[] h) {
//		int count = 0;
//		for (int i = 0; i < h.length; ++i) {
//			if (h[i].equals(need)) return i;
//		}
//		return -1;
//	}


//	public static Boolean isAnagram(String word1, String word2) {
//		List<String> listWord1 = new ArrayList<>(Arrays.asList(word1.split("")));
//		List<String> listWord2 = new ArrayList<>(Arrays.asList(word2.split("")));
//
//		Collections.sort(listWord1);
//		Collections.sort(listWord2);
//
//		word1 = String.join("", listWord1);
//		word2 = String.join("", listWord2);
//		return word1.equals(word2);
//	}


//	static int NO_OF_CHARS = 256;
//
//	static boolean canFormPalindrome(String str) {
//
//		int[] count = new int[NO_OF_CHARS];
//		Arrays.fill(count, 0);
//		for (int i = 0; i < str.length(); i++)
//			count[(int) (str.charAt(i))]++;
//		int odd = 0;
//
//		for (int i = 0; i < NO_OF_CHARS; i++) {
//			if ((count[i] & 1) == 1)
//				odd++;
//
//			if (odd > 1)
//				return false;
//		}
//		return true;
//	}


//	public static int numberOfPairs(Integer[] array, int sum) {
//		Set<Integer> set = new HashSet<>(Arrays.asList(array));
//
//		Set<String> uniquePairs = new HashSet<String>();
//
//		for (int i : array) {
//			int x = sum - i;
//			if (set.contains(x)) {
//				int[] y = new int[]{x, i};
//				Arrays.sort(y);
//				uniquePairs.add(Arrays.toString(y));
//			}
//		}
//
//		return uniquePairs.size();
//	}


//	static String solution(String query) {
//		Stack<Character> st = new Stack<>();
//		int star = 0;
//		for (char c : query.toCharArray()) {
//			if (c == '*') {
//				star++;
//				continue;
//			}
//			if (c == '(') {
//				st.push(c);
//			} else if (!st.empty() && c == ')') {
//				st.pop();
//			} else if (c == ')' && star > 0) {
//				star--;
//			} else {
//				return "Not Blanaced";
//			}
//		}
//		if (st.empty() || star - st.size() >= 0) {
//			return "Balanced";
//		} else return "Not Balanced";
//	}


//	public static Document transformXmlDocument(Document sourceDocument, InputStream xsltFile) {
//		DOMSource xmlSource = new DOMSource(sourceDocument);
//		StreamSource xsltSource = new StreamSource(xsltFile);
//
//		Document transformedData = null;
//
//		try {
//			TransformerFactory factory = TransformerFactory.newInstance();
//			Transformer transformer = factory.newTransformer(xsltSource);
//
//			ByteArrayOutputStream output = new ByteArrayOutputStream();
//			StreamResult result = new StreamResult(output);
//
//			transformer.transform(xmlSource, result);
//
//			DocumentBuilder resultBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//			transformedData = resultBuilder.parse(
//					new InputSource(
//							new StringReader(
//									new String(output.toByteArray())
//							)
//					)
//			);
//			System.out.println(transformedData);
//		} catch (Exception e) {
//			System.out.println("XSLT Transformation"+ e.getMessage());
//		}
//
//		return transformedData;
//	}


//public static boolean checkPalindrome(String str) {
//	for(int i=0;i<=str.length()/2;i++)
//		if(str.charAt(i)!=str.charAt(str.length()-1-i))
//			return false;
//	return true;
//}


//	public static void printAllPalindrome(String str) {
//		for(int i=0;i<=str.length();i++)
//			for(int j=i;j<str.length();j++)
//				if(checkPalindrome(str.substring(i,j+1)))
//					System.out.println(str.substring(i,j+1));
//	}

    public static void main(String[] args) {

//        String builder multiple result- abbaccca
//      StringBuilder sb = new StringBuilder();
//		sb.append("aaa").insert(1,"bb").insert(4,"ccc");
//		System.out.println(sb.toString());

//        main springboot run method call
//        SpringApplication.run(UserTimelineProjectApplication.class,args);

//      Maximum classes
//		Scanner sc = new Scanner(System.in);
//		int noOfDays = Integer.parseInt(sc.nextLine().trim());
//		System.out.println(noOfDays);
//		for (int i = 1; i <= noOfDays; i++) {
//			int noOfSubjects = Integer.parseInt(sc.nextLine().trim());
//			System.out.println(noOfSubjects);
//			Schedule s = new Schedule();
//			for (int j = 0; j < noOfSubjects; j++) {
//				String line[] = sc.nextLine().split(" ");
//				System.out.println(Arrays.toString(line));
//				s.addClass(line[0], Integer.parseInt(line[1].replace(":", "")), Integer.parseInt(line[2].replace(":", "")));
//			}
//			System.out.println("maximum classes: " + s.getMaxSchedule());}

//      print distinct elements
//		String myString = "1,1,2,2,3,3,3,4,4";
//		String noDuplicates = Arrays.stream(myString.split(","))
//				.distinct()
//				.collect(Collectors.joining());
//		System.out.println(noDuplicates);

// transform xml to xsl
//  try {
//	File file = new File("/Users/pushpendra/Documents/userTimelineProject/src/main/resources/MCce8e30a7-491f-494f-a506-646626569ca3_RSuite_EDMS_20190911_114044_0_metadata.xml");
//
//	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//	DocumentBuilder db = dbf.newDocumentBuilder();
//	Document doc = db.parse(file);
//	System.out.println(doc.getDocumentElement().getTextContent());
//    InputStream xsl = new FileInputStream(new File("/Users/pushpendra/Documents/userTimelineProject/src/main/resources/postFFItemStatusFile.xsl"));
// 	Document fd = transformXmlDocument(doc,xsl);
//	System.out.println(fd);
//} catch (Exception e) {
//	System.out.println(e);
//}

//      check balanced string
//		System.out.println(solution("()()*)*"));

//      convert list<object> to map
//		List<Port> p = new ArrayList<>();
//		Port po = new Port("adsfd",1);
//		Port po1 = new Port("adsf3read",2);
//		Port po2 = new Port("adsfafgrd",1);
//		p.add(po);
//		p.add(po1);
//		p.add(po2);
//		Map<String,Port> map = p.stream().collect(Collectors.toMap(Port::getN, Function.identity()));
//		System.out.println(map.get(0));

//      Sort string characters in reverse order
//		String randomString = "MSL";
//		String sortedChars = Stream.of( randomString.split("") )
//				.sorted(Collections.reverseOrder())
//				.collect(Collectors.joining());
//        System.out.println(sortedChars);

//      Calculate the frequency of each character
//		String ra = "eeeedddc";
//		Set<String> set = new HashSet<String>(Arrays.asList(ra.split("")));
//		if(set.size()==1) System.out.println(0);
//		List<String> list = Arrays.asList(ra.split(""));
//		Map<Integer, String> map = new HashMap<>();
//		int count=0;
//		for(String s:set){
//			int temp=Collections.frequency(list,s);
//			if(map.containsKey(temp)){
//				for(int i=temp;i>0;i--){
//					if(!map.containsKey(i)){
//						map.put(i,s);
//						break;
//					}
//					count++;
//				}
//			}
//			else map.put(temp,s);
//		}
//        map.entrySet().forEach(System.out::println);

//      calculate 1's in the power of 11.
//		int a = 2;
//		long temp = (long) Math.pow(11,a);
//		int count=0;
//		System.out.println(temp);
//		while(temp>0){
//			count = temp%10==1?count+1:count;
//			temp/=10;
//		}
//        System.out.println(count);

    }
}
