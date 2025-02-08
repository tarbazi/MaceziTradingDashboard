import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ClientPageComponent } from './client-page/client-page.component';

export const Home_Route: Routes = [
    {path: "", component: LoginComponent},
    {path: "client-path", component: ClientPageComponent}
];