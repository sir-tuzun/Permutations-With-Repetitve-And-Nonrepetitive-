# Permutations-With-Repetitve-And-Nonrepetitive-
showing permutations with repetitve and nonrepetitive

Nonrepetitive permutations work simple. Here is sample,

s1 = "";
s2 = "ABC";

                                     ABC                                         --------> loop 1

         A BC                        B AC                        C AB            --------> loop 2

      AB C    AC B              BA C      BC A               CA B       CB A     --------> loop 3

    ABC           ACB        BAC                BCA       CAB               CBA   
  s2 length is zero at leaf nodes so the method will print the permutation and the lopp finished and program continue with next step.
                                                                                        
                                                                                        
Steps : 

    for i:= ABC length
    
        i = 0 and A is first letter in s1.
        for j:= BC length
      
          for k:= C length
          s1 = ABC and s2 length 0 then print s1.
          end
      
          for l:= B length
          s1 = ACB and s2 length 0 then print s1.
          end
         end  
  
        i = 1 and B is first letter in s1.
        for j:= AC length
  
          for k:= C length
          s1 = BAC and s2 length 0 then print s1.
          end
      
          for l:= A length
          s1 = BCA and s2 length 0 then print s1.
          end
         end 
   
        i = 2 and C is first letter in s1.
        for j:= AB length
      
          for k:= B length
          s1 = CAB and s2 length 0 then print s1.
          end
      
          for l:= A length
          s1 = CBA and s2 length 0 then print s1.
          end
         end
      end   
    
***********************************************************************************************************************************************************    
    
 Repetitive permutation work has a basic principle. We should mark every repetitive letter except first repetitive letter. Because first repetitive letter
 will constitute matchless permutation.
 
    
    
                                                                          ABABC                                                     -----> Loop 1
          
                    A BABC                                          B AABC                      A BABC*         B AABC*      C ABAB -----> Loop 2

      AB ABC    AA BBC   AB BAC*   AC BAB         BA ABC     BA ABC*     BB AAC    BC AAB         ...             ...          ...  -----> Loop 3        

                      
Before create a loop program will contol every repetitive letter and mark to each of. Realize there are similar permutataion in loop 1 and loop 2 line. Program will decide to create a new loop with isRepetitive method and skip the permutations which signed with *. 

           
                       
                
    
    
    
    
    
