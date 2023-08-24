import { Directive,ElementRef,Renderer2,HostListener } from '@angular/core';

@Directive({
  selector: '[appColouring]'
})
export class ColouringDirective {

  constructor(private elementRef:ElementRef,private render: Renderer2) {
    render.setStyle(elementRef.nativeElement,'backgroundColor','blue');
   }
   setBgColor(color:string){
    this.render.setStyle(this.elementRef.nativeElement,'backgroundColor',color);
   }

   @HostListener('mouseenter') onMouseEnter(){
    this.setBgColor('yellow');
   }
   @HostListener('mouseleave') onMouseLeave(){
    this.setBgColor('pink');
   }
   @HostListener('click') onClick(){
    this.setBgColor('red');
   }

}
