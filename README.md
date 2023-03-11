# Permutations-With-Repetitve-And-Nonrepetitive-
showing permutations with repetitve and nonrepetitive

Nonrepetitive permutations work basicly. Here is sample,

s1 = "";
s2 = "ABC";

                                   ABC

      A BC                        B AC                        C AB            --------> loops 1

  AB C    AC B              BA C      BC A               CA B       CB A      --------> loops 2

ABC           ACB        BAC                BCA       CAB               CBA   --------> s2 length is zero here so the method will print the 
                                                                                        permutation and the lopp finished and program continue with       
                                                                                        perivious loop.
                                                                                        
                                                                                        
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
    
    
    
    
    
    
    
    
