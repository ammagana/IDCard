import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IDInformationComponent } from './Components/id-information/id-information.component';
import { BuildingComponent } from './Components/building/building.component';
import { DepartmentComponent } from './Components/department/department.component';
import { ManagerComponent } from './Components/manager/manager.component';
import { UserComponent } from './Components/user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    IDInformationComponent,
    BuildingComponent,
    DepartmentComponent,
    ManagerComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
