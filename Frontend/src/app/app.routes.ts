import { HomeComponent } from './home/home.component';
import { Routes } from '@angular/router';

export const App_Routes: Routes = [
    {
        path: "", 
        component: HomeComponent,
        loadChildren: () => import("./home/home.route").then((m) => m.Home_Route)
    }
];
