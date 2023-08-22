/*
let marks1:number=56,marks2: number=90;
let bin: number=0b100;
let octal: number=0o67;
let hexa : number= 0XD;
let big : bigint= 66786878789787n;*/


//Template literal types
let firstname : string ='John';
//let profile:string='I am '+ firstname;
let profile : string = `I am ${firstname}`;
console.log(profile);



/*
//Object Creation
const employee ={
    firstname : 'John',
    age : 56
}
console.log(employee.age);

let vacant : {}={};
console.log(vacant.toString());
*/

//Arrays
let skills : string[];
skills=['Software Engineering'];

let skills2 =['problem Solving'];
skills[1]='Java';
skills2.push('Java123');

let series=[1,2,3];
console.log(series.length);//3
let double=series.map(e=>e*2);
console.log(double); //2,4,6

let scores : (string |number)[];
scores =['Programming', 5];

//Tuple
let empTuple = ["Rohit Sharma", 25, "Agent"];  
console.log("Name of the Employee is : "+empTuple [0]);  
console.log("Age of the Employee is : "+empTuple [1]);  
console.log(empTuple [0]+" is working in "+empTuple [2]);  


//Tuple Declaration  
let empTuple1 = ["Agent", 101, "Abhishek"];     
//Passing tuples in function    
function display(tuple_values:any[]) {    
   for(let i = 0;i<empTuple1.length;i++) {     
      console.log(empTuple[i]);    
   }      
}    
//Calling tuple in function    
display(empTuple1);  



