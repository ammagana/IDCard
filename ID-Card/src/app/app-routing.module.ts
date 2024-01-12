import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IDInformationComponent } from './Components/id-information/id-information.component';
import { UserComponent } from './Components/user/user.component';
import { ManagerComponent } from './Components/manager/manager.component';
import { DepartmentComponent } from './Components/department/department.component';
import { BuildingComponent } from './Components/building/building.component';

const routes: Routes = [
  {path: '', redirectTo: '/id-service', pathMatch: 'full'},
  {path: 'id-service', component: IDInformationComponent},
  {path: 'building', component: BuildingComponent},
  {path: 'department', component: DepartmentComponent},
  {path: 'manager', component: ManagerComponent},
  {path: 'user', component: UserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
