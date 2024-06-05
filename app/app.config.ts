import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppConfigService {
  private config = {
    apiUrl: 'http://localhost:3000/api',
    featureToggle: {
      enableFeatureX: true
    }
  };

  getConfig() {
    return this.config;
  }
}
