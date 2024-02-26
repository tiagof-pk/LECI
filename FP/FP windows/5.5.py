def countDigits(str):
   c=0
   for i in str :
      if i.isdigit() :
         c += 1
   return c