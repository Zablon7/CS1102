public class Quiz {


    public static void main(String[] args) {

        Question question = new MultipleChoiceQuestion(
                "What is the first Java course at UoPeople?",
        "A. CS1101",
        "B. CS1102",
        "C. CS1103",
        "D. CS2203",
        "E: CS1104",
        "b");



        Question question1 = new TrueFalseQuestion("We have a quiz next week", "FALSE");
        question1.check();


        question = new MultipleChoiceQuestion(
             "Where is UoPeople located?",
             "A. Pasadena, California",
             "B. Baltimore, Maryland",
             "C. Tampa, Florida",
             "D. Los Angeles, California",
                "E. Fayetteville, North Carolina",
                "a"
        );



        question = new MultipleChoiceQuestion(
                "How many weeks has it been since you started CS1102",
                "A. 6 weeks",
                "B. 2 weeks",
                "C. 4 weeks",
                "D. 5 weeks",
                "E. 3 weeks",
                "c"
        );



        question = new MultipleChoiceQuestion(
                "Who played Elliot Alderson on \"Mr robot\"?",
                "A. Martin Wallstrom",
                "B. Bobby Cannavale",
                "C. Elliot Vallar",
                "D. Rami Malek",
                "E. Barry Allen",
                "d"
        );



        question = new MultipleChoiceQuestion(
                "Who played Walter O'Brien on \"scorpion\"?",
                "A. Scott Porter",
                "B. Robert Patrick",
                "C. Ari Stidham",
                "D. Eddie Kaye Thomas",
                "E. Elyes Gabel",
                "e"
        );




    }
}
