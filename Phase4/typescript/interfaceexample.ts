interface PersonDetails{
    firstname : string;
    lastname : string;
    display: ()=>string ;
   
    
}


function getFullName(person : PersonDetails){
    return person.firstname+" "+ person.lastname;
}
let obj : PersonDetails={
    firstname : 'John',
    lastname : 'Doe',
    display: ():string =>{return "Hello";} 
    

};
console.log(getFullName(obj));
console.log(obj.display());