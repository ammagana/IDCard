import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IDInformationComponent } from './Components/id-information/id-information.component';

const routes: Routes = [
  {path: '', redirectTo: '/id-service', pathMatch: 'full'},
  {path: 'id-service', component: IDInformationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
