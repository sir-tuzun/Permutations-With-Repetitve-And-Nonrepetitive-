# Permutations-With-Repetitve-And-Nonrepetitive-
showing permutations with repetitve and nonrepetitive

Nonrepetitive permutations work basicly. Here is sample,

s1 = "";
s2 = "ABC";

                                     ABC                                         --------> loops 1

         A BC                        B AC                        C AB            --------> loops 2

      AB C    AC B              BA C      BC A               CA B       CB A     --------> loops 3

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
    
    
    
 Repetitive permutation work...
    
    
                                                                        ABABC                                        
          
                A BABC                                          B AABC                      A BABC*         B AABC*           C ABAB 

  AB ABC    AA BBC   AB BAC*   AC BAB         BA ABC     BA ABC*     BB AAC    BC AAB                                         

                        
    
    
    
    
    
