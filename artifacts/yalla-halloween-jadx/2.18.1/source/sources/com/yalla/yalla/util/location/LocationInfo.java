package com.yalla.yalla.util.location;

import OooO00o.OooO00o;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.app.base.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes3.dex */
public class LocationInfo extends AbsJavaBean {
    private Location location;
    private Context mContext;
    private boolean isGPSEnabled = false;
    private boolean isNetworkEnabled = false;
    private String city = null;
    private String countryCode = null;
    private boolean isToLocationInfo = false;

    public LocationInfo(Context context) {
        this.mContext = context;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public double getLatitude() {
        Location location = this.location;
        if (location != null) {
            return location.getLatitude();
        }
        return 0.0d;
    }

    public Location getLocation() {
        return this.location;
    }

    public double getLongitude() {
        Location location = this.location;
        if (location != null) {
            return location.getLongitude();
        }
        return 0.0d;
    }

    public boolean isGPSEnabled() {
        return this.isGPSEnabled;
    }

    public boolean isNetworkEnabled() {
        return this.isNetworkEnabled;
    }

    public boolean isNotLocation() {
        return this.location == null || (getLongitude() < 1.0d && getLatitude() < 1.0d && TextUtils.isEmpty(getCity()));
    }

    public boolean isToLocationInfo() {
        return this.isToLocationInfo;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public LocationInfo setGPSEnabled(boolean z) {
        this.isGPSEnabled = z;
        return this;
    }

    public LocationInfo setLocation(Location location) {
        this.location = location;
        return this;
    }

    public LocationInfo setNetworkEnabled(boolean z) {
        this.isNetworkEnabled = z;
        return this;
    }

    public void setToLocationInfo(boolean z) {
        this.isToLocationInfo = z;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        if (this.location == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("LocationInfo{\n mContext=");
            sbOooO0o0.append(this.mContext);
            sbOooO0o0.append("\n isGPSEnabled=");
            sbOooO0o0.append(this.isGPSEnabled);
            sbOooO0o0.append("\n isNetworkEnabled=");
            sbOooO0o0.append(this.isNetworkEnabled);
            sbOooO0o0.append("\n location='");
            sbOooO0o0.append(this.location);
            sbOooO0o0.append('}');
            return sbOooO0o0.toString();
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("LocationInfo{\n mContext=");
        sbOooO0o1.append(this.mContext);
        sbOooO0o1.append("\n isGPSEnabled=");
        sbOooO0o1.append(this.isGPSEnabled);
        sbOooO0o1.append("\n isNetworkEnabled=");
        sbOooO0o1.append(this.isNetworkEnabled);
        sbOooO0o1.append("\n location='");
        sbOooO0o1.append(this.location);
        sbOooO0o1.append("'\n location.getLatitude =");
        sbOooO0o1.append(this.location.getLatitude());
        sbOooO0o1.append("\n location.getLongitude =");
        sbOooO0o1.append(this.location.getLongitude());
        sbOooO0o1.append("}");
        return sbOooO0o1.toString();
    }
}
