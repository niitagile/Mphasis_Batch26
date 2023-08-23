import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactiveformexampleComponent } from './reactiveformexample.component';

describe('ReactiveformexampleComponent', () => {
  let component: ReactiveformexampleComponent;
  let fixture: ComponentFixture<ReactiveformexampleComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ReactiveformexampleComponent]
    });
    fixture = TestBed.createComponent(ReactiveformexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
