package com.netcracker.chapter9;

public class Question
 {
         private String text;
         private String answer;

         /**
 10 Constructs a question with empty question and answer.
 11 */
         public Question()
         {
         text = "";
         answer = "";
         }

         /**
 19 Sets the question text.
 20 @param questionText the text of this question
 21 */
         public void setText(String questionText)
         {
         text = questionText;
         }

         /**
 28 Sets the answer for this question.
 29 @param correctResponse the answer
 30 */
         public void setAnswer(String correctResponse)
         {
         answer = correctResponse;
         }

         /**
 37 Checks a given response for correctness.
 38 @param response the response to check
 39 @return true if the response was correct, false otherwise
 40 */
         public boolean checkAnswer(String response)
         {
         return response.equals(answer);
         }

         /**
 47 Displays this question.
 48 */
         public void display()
         {
         System.out.println(text);
        }
         }