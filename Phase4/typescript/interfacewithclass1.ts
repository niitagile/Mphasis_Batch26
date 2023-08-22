interface Employee1 {
    id: number;
    name: string;
    tasks: string[];
  
    address: {
      country: string;
      city: string;
    };
  
    doWork(): void;
  }
  
  class Developer1 implements Employee1 {
    tasks: string[] = ['develop', 'test'];
  
    address: { country: string; city: string } = {
      country: 'Austria',
      city: 'Linz',
    };
  
    constructor(public id: number, public name: string) {
      this.id = id;
      this.name = name;
    }
  
    doWork() {
      console.log(`${this.name} writes code`);
      console.log(this.address);
    }
  }
  
  const dev = new Developer1(1, 'Tom');
  
  console.log(dev.name); 
  dev.doWork();