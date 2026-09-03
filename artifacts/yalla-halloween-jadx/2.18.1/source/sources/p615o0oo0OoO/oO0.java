package p615o0oo0OoO;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.location.LocationInfo;
import java.util.List;
import o00Oo00.OooO0OO;
import p254o00ooO0O.o000O0O0;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0 extends AsyncTask<String, Integer, LocationInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f48379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LocationManager f48380OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO<LocationInfo> f48382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public LocationInfo f48384OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f48383OooO0o = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f48381OooO0OO = new OooO00o();

    public class OooO00o implements LocationListener {
        public OooO00o() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            o00O00.OooO0O0("LocationGetAsyncTaskonLocationChanged location " + location);
            oO0 oo0 = oO0.this;
            LocationInfo locationInfo = oo0.f48384OooO0o0;
            oo0.OooO00o(locationInfo, location);
            oo0.f48384OooO0o0 = locationInfo;
            oO0 oo1 = oO0.this;
            OooO0OO<LocationInfo> oooO0OO = oo1.f48382OooO0Oo;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(oo1.f48384OooO0o0);
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }

    public oO0(Context context, OooO0OO<LocationInfo> oooO0OO) {
        this.f48379OooO00o = context;
        this.f48382OooO0Oo = oooO0OO;
        this.f48384OooO0o0 = new LocationInfo(context);
    }

    public final LocationInfo OooO00o(LocationInfo locationInfo, Location location) {
        String countryCode = "";
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Null_Location_Info);
        boolean z = false;
        try {
            List<Address> fromLocation = new Geocoder(this.f48379OooO00o).getFromLocation(location.getLatitude(), location.getLongitude(), 5);
            StringBuilder sb = new StringBuilder();
            sb.append("getCity \n AddressList = ");
            sb.append(fromLocation);
            sb.append("\n location =");
            sb.append(location);
            sb.append("\n getLatitude = ");
            sb.append(location.getLatitude());
            sb.append("\n getLongitude = ");
            sb.append(location.getLongitude());
            sb.append("\n stringBuffer = ");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("locationStringBuffer:[");
            boolean z2 = false;
            for (Address address : fromLocation) {
                if (z2) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(address);
                z2 = true;
            }
            stringBuffer.append("]");
            sb.append((Object) stringBuffer);
            o00O00.OooOO0O(sb.toString());
            if (!fromLocation.isEmpty()) {
                strOooO0OO = fromLocation.get(0).getLocality();
                countryCode = fromLocation.get(0).getCountryCode();
                z = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(strOooO0OO)) {
            strOooO0OO = o000O0O0.OooO0OO(R.string.Null_Location_Info);
        }
        locationInfo.setToLocationInfo(z);
        locationInfo.setCity(strOooO0OO);
        locationInfo.setCountryCode(countryCode);
        return locationInfo;
    }

    @Override // android.os.AsyncTask
    public final LocationInfo doInBackground(String[] strArr) {
        try {
            Looper.prepare();
        } catch (Exception e) {
            e.printStackTrace();
        }
        LocationInfo locationInfo = new LocationInfo(this.f48379OooO00o);
        try {
            LocationManager locationManager = (LocationManager) this.f48379OooO00o.getSystemService("location");
            this.f48380OooO0O0 = locationManager;
            locationInfo.setGPSEnabled(locationManager.isProviderEnabled("gps"));
            locationInfo.setNetworkEnabled(this.f48380OooO0O0.isProviderEnabled("network"));
            locationInfo.setGPSEnabled(this.f48380OooO0O0.isProviderEnabled("passive"));
            Location lastKnownLocation = this.f48380OooO0O0.getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                locationInfo.setLocation(lastKnownLocation);
            } else {
                Location lastKnownLocation2 = this.f48380OooO0O0.getLastKnownLocation("network");
                if (lastKnownLocation2 != null) {
                    locationInfo.setLocation(lastKnownLocation2);
                } else {
                    Location lastKnownLocation3 = this.f48380OooO0O0.getLastKnownLocation("passive");
                    if (lastKnownLocation3 != null) {
                        locationInfo.setLocation(lastKnownLocation3);
                    }
                }
            }
            this.f48380OooO0O0.requestLocationUpdates("gps", 60000L, 10.0f, this.f48381OooO0OO, Looper.myLooper());
            this.f48380OooO0O0.requestLocationUpdates("network", 60000L, 10.0f, this.f48381OooO0OO, Looper.myLooper());
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            if (this.f48380OooO0O0 != null && this.f48383OooO0o) {
                o00O00.OooO0O0("LocationGetAsyncTaskgetLocation removeUpdates ");
                this.f48380OooO0O0.removeUpdates(this.f48381OooO0OO);
            }
        }
        return locationInfo;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(LocationInfo locationInfo) {
        LocationInfo locationInfo2 = locationInfo;
        super.onPostExecute(locationInfo2);
        o00O00.OooO0O0("LocationGetAsyncTaskonPostExecute locationInfo " + locationInfo2);
        OooO00o(locationInfo2, locationInfo2.getLocation());
        this.f48384OooO0o0 = locationInfo2;
        OooO0OO<LocationInfo> oooO0OO = this.f48382OooO0Oo;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(locationInfo2);
        }
        try {
            Looper.loop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
