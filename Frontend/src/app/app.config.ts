import { ApplicationConfig } from '@angular/core';
import { provideRouter } from '@angular/router';

import { App_Routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';

export const appConfig: ApplicationConfig = {
  providers: [provideRouter(App_Routes), provideClientHydration()]
};
