interface Employees {
    id: number;
    name: string;
    tasks: string[];
  
    doWork(): void;
  }
  
  class Developer implements Employees {
    constructor(public id: number, public name: string, public tasks: string[]) {
      this.id = id;
      this.name = name;
      this.tasks = tasks;
    }
  
    doWork() {
      console.log(`${this.name} writes code`);
    }
  }
  
  const dev = new Developer(1, 'Tom', ['develop', 'test', 'ship']);
  
  console.log(dev.name); 
  dev.doWork();
  