import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateformexampleComponent } from './templateformexample.component';

describe('TemplateformexampleComponent', () => {
  let component: TemplateformexampleComponent;
  let fixture: ComponentFixture<TemplateformexampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TemplateformexampleComponent]
    });
    fixture = TestBed.createComponent(TemplateformexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
