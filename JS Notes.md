var,let,const

var a= 12 ;

var username=23\*(12+120)+50;

var a;

let a =13;

const a =13;

d=16;

---

let a=12; //declare karna

let a =14 ; //declared + intilazied

const a ="labb";

const b ="labra";

//Scope(Global , local ,functional)

var a =12 ;

{

   let a =12 ;

}

function abcd()

{



}

//Reassignment , redeclaration

var a =12 ;

a=15 ;

let b=13 ;

b=90; \*/

//Temporal Dead zone

/\*console.log(a);

let a=12; \*/

//utna area jitna mei js ko variable ka pata to hai ki variable hai but uska value kya hai ye nhi pata

//Hoisting impact per type

//hoisting means ek variable ko jab js mei banate hai to wo variable do hisso mei toot jata hai and uska declare part upar chala jata haiand uska intilazation part niche reh jata hai

/\*var a =12;

var a=undefined;

a=12; \*/

 

console.log(a);

var a=16;

---

var x=1;  //global

{

    var x=2; //Golbal

}

console.log(x);

//var only respect blocks

//global x 2 override global x 1 ;

---

let a =10; //bloc scope//global

{

    let a =20 ;

    console.log("Inside:",a);

}

console.log("Outside:",a);

---



if(true){

var a=1;

let b=2;

}

console.log(a);

console.log(b);

Output

1

script.js:6  Uncaught Reference Error: b is not defined

    at script.js:6:13



---



const person ={name: "Harsh"};

person.name="sharma"; //allowed

person={}://Not allowed

we cannot resign the constant value with === this sign (Equal to) .

---

object.freeze

The Object.freeze() method in JavaScript is used to freeze an object, making it immutable. This means that once an object is frozen, you cannot add, remove, or modify its properties. The method returns the same object that was passed to it, without creating a frozen copy.



Syntax



Object.freeze(obj);

Copy

obj: The object to freeze.

---

               DATA TYPES

Types of data

1.Primitive Data Types  : Aisi sari values jinko copy karne par ek real copy mil jaye

                         Example - String , Number Boolean ,null , undefined , symbol,

                         bigint

2.Refrence datatype    :Inko copy karne par real copy nahi milegi par aapko refernce

                        milega parents ka

                        Example - Arrays ,Object, functions

                                   \[]       {}      ()



let a = \[1,2,3];

let b=a;



String  Wrapped data inside these are {''-Single Quotes ,""Double Quotes, ``-Backtick} 	are called as String.

Number = //12-Integer ,12.3 Integer

Boolean True and False

Null - Aapne jaanbujh kar koi value nahi dii

undefined - Iska ka matlab ki appne ek variable banaya aur usey value nahi dii to jo value by default mili wo undefined hai

Symbool : Its is primitive vale create karti hai .  Unique immutable value

let u1 = Symbol("uid");

let u2 = Symbol("uid");

u1

Symbol(uid)

u2

Symbol(uid)



let obj = {

    name: "Aashu",

    age: 21,

    city: "New Delhi",

    email:"aashupraksh0@gmial.com"

};

let u1= Symbol("uid");

obj\[u1]= "001";



let a = 9007199254740991n;

when adding add with a+2n ;



Reference Value

let a =\[1,2,3];

b=a;

---

//Dynamic Typing in Javascript - JS mein static typig nahi hai and yaha par hai dynamic typing jiska matlab hai aap data ko change kar sakte hai ho kyukni yaha par dynamic data type hai

//type of quirks(Eg- type of null=== 'object')

---

Type Coercion (== vs ==)

Truthy vs False Values

Type Coercion - Concept Jimse aapka ek type automatically convert hojayega

0 False "" null  undefined NaN document.all-> Flase

---

Practice session

true + false = 1 + 0 =1

type of NaN == 'number'//true

difference b/w undefined and null

let x ;

console.log(x); //undefined

let y=null ;

console.log(y);  //null

---

OPERATORS

Arithmetic + , \_,/,\*,  %,\*\*

Addition

1+2=3

"Ha"+"rsh"="harsh"

Cocaination

Subtract

12-6=6

6-0=0

Multiply(\*)

12/6=2

12\*2=24

Modulus

12%2=0

6%2=0

7%2=1

\*\*Exponential operator

2\*\*3=8

Comparison Operator

= value dalna ; //Assignment Operator

12==13 //Faslse //== Not strict Comparison

12=="12"//True it doenot check type

13===13 //True

12!= 13 //True (No Equal to)

12 !=="12"

12<133

1122<1133

22<=22 //True

---

=

+=

-=

\*=

/=

%=

let a = 12;

a += 3;

a -= 11;

a \*= 2;

a /= 2;

a %= 3;

---

Logical Operator

\&\& || !

AND OPERAOR (\&\&)

true \&\& true ;

false \&\& true  ;

False \&\& False ;

true \&\& true  ;

OR OPERAOR(If onside is true it always answer final is true)

false ||  true

NOT OPERATOR(!)

!!12 = TRUE

!12 =False

---

Unary operator

\+ - ! typeoff

+"5"

!12 false type

typeof 12

let a =12;

a++;

++a;

---

Ternary Operator

12>13 ? console.log("true"): console.log("false")

ANS-FALSE

---

TYPEOF to know the behavior  i is used with primitive value

typeof null

'Object'

typeof \[]

'Object'

typeof{}

'Object'

typeof function(){}

function

typeof NAN

Number \*Error\*

---

Instanceof is used when refernce variable

---

**let x=10 ;**

**let y=20 ;**

**if(x>5\&\&y<25)**

**{**

    \*\*console.log("A");\*\*



**}**

**else{**

    \*\*console.log("B");\*\*



**}**

**ANSWER-A**

**-----------------------------------------------------------------**

**let isAdmin =true;**

**let isloggedIn=false ;**

**if(isAdmin || isloggeedIn) {**

    \*\*console.log("Access Granted");\*\*



**}**

**else {**

    \*\*console.log("Access Denied")\*\*



**}**

**Output-Access Granted**

**-------------------------------------------------------------------**

**let temp = 35 ;**

**if (!(temp<30)){**

**console.log("Hot")**

**}else {**

**console.log("Cold")**

**}**

**OUTPUT- HOT**

**--------------------------------------------------------------------**

**let a=0 ;**

**if(a){**

**console.log("Truthy");**

**}else {**

**console.log("Falsy");**

**}**

**Output- Falsy because 0 is false**

**--------------------------------------------------------------------**

**let score =48 ;**

**let grade = score>=90 ? "A" : score>=75 ? "b" : score >= 60 ? "c" : "Fail" ;**

**console.log(grade);**

**Output-Fail**

**----------------------------------------------------------------------**

**let points=60 ;**

**let status=points>100 ?"Gold" : points>50 ? "silver" : "Bronze" ;**

**console.log(status);**

Output-Silver

---

let loggedIn = true ;

let hasToken =false ;

let access=loggedIn \&\& hasToken ? "Allow" : "Deny" ;

console.log(access);

---

let a=5 ;

a++;

console.log(a);

---

let x =3 ;

let y=++x ;

console.log(y,x) ;

---

let m =10 ;

console.log(--m);

console.log(m);

---

let n = 5;

let result = --n + ++n;

console. log ( result) ;

o/p-9

---

let likes =100 ;

function likepost(){

return ++likes;

}

console.log(likepost());

console.log(likes);

---

let a =5 ;

if (--a == 5) {

    console.log("MATCHED");

}else{

    console.log("UNMATCHED")

}

---

!!"" //false

!!"Hello" //true

!!0  //flase

!!1  //True

**------------------------------------------------------------**

**Control flow**

**if else else if**

**Switch case**

**Early return pattern**

**------------------------------------------------------------**

**let marks = 78;**

**if (marks >= 90) {**

**console.log("A");**

**} else if (marks >= 75) {**

**console.log("B");**

**} else {**

**console.log("C");**

**}**

**------------------------------------------------------------**

**Switch(1){**

**case 1:**

**console.log("Case-1");**

**break ;**

**case 2:**

**console.log("case-2");**

**break ;**

**case 3 ;**

**console.log("case-3");**

**break;**

**default :**

**console.log("default")**

**}**

**----------------------------------------------------**



**let fruit = "apple";**

**switch (fruit) {**

**case "banana":**

**console.log("Yellow");**

**break;**

**case "apple":**

**console.log("Red");**

**break;**

**default:**

**console.log("Unknown");**

**}**

**---------------------------------------------------**

**function getval(val){**

&nbsp;   \*\*if (val<25) return "D";\*\*

    \*\*else if(val<50) return "C";\*\* 

    \*\*else if(val<75) return "B";\*\* 

    \*\*else return "A";\*\* 


**}**

**console.log(getval(72));**

**---------------------------------------------------**

**function getGrad(score){**

&nbsp;   \*\*if(score >=90 \\\&\\\& score<=100){\*\*

        \*\*return "A+";\*\*

    \*\*}\*\*

    \*\*else if (score >= 80 \\\&\\\& score <=89){\*\*

        \*\*return "A" ;\*\*

    \*\*}\*\*

    \*\*else if (score>=70 \\\&\\\& score <=79){\*\*

        \*\*return "B" ;\*\*

    \*\*}\*\*

     \*\*else if (score>=60 \\\&\\\& score <=69){\*\*

        \*\*return "C" ;\*\*

    \*\*}\*\*

     \*\*else if (score>=33 \\\&\\\& score <=59){\*\*

        \*\*return "D" ;\*\*

    \*\*}\*\*

    \*\*else if (score>=0 \\\&\\\& score <=32){\*\*

        \*\*return "Fail" ;\*\*

    \*\*}\*\*

    \*\*else {\*\*

        \*\*return "Invaild Marks";\*\*

     \*\*}\*\*


**}**

**console.log(getGrad(73));**

**--------------------------------------------------------**

**//Rock-Papaer Scissor  logic**

**/\***

**function rps (user , computer){**

**if(user === "rock" \&\& computer === "scissor" )return  "user" ;**

**if(user === "scissor" \&\& computer === "rock") return "computer";**

**if(user === "paper" \&\& computer === "rock") return "user" ;**

**if(user === "rock" \&\& computer === "paper") return "computer" ;**

**if (user === "scissor" \&\& computer === "rock") return "computer" ;**

**}**

**rps("rock","scissor"); \*/**

**function rps (user,computer){**

&nbsp;   \*\*if (user === computer) return "draw";\*\* 

    \*\*if (user=== "rock" \\\&\\\& computer === "scissor") return "user" ;\*\* 

    \*\*if (user === "scissor" \\\&\\\& computer === "paper") return "user";\*\* 

    \*\*if (user === "paper" \\\&\\\& computer === "rock") return "user" ;\*\* 



    \*\*return "computer";\*\*






**}**

**console.log(rps("rock" , "scissor"));**

**console.log(rps("rock" , "paper"));**

**console.log(rps("rock" , "rock"));**

**--------------------------------------------------------------------**

LOOP 

Repeat karne ko loop kehte hai

11111111111111111

12345678

* kaha se jabana hai -> khaha tak jana hai -> kaise jana hai 
* for loop 
* Kaha se jana hai -> kkab rukna hai -> kaise jaana hai 

&nbsp;  **While** 

**---------------------------------------------------------------------**

**let i =1;** 

**while(i<33){**

**console.log(i)**

**i++;**

**}**











 

















 

 



 

















 

