package p083o000OoOo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f28362OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static OooOo00 f28363OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f28364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<OooO0OO>> f28365OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ArrayList<OooO0OO>> f28366OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f28367OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f28368OooO0o0;

    public class OooO00o extends Handler {
        public OooO00o(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            OooO0O0[] oooO0O0Arr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            OooOo00 oooOo00 = OooOo00.this;
            while (true) {
                synchronized (oooOo00.f28365OooO0O0) {
                    size = oooOo00.f28367OooO0Oo.size();
                    if (size <= 0) {
                        return;
                    }
                    oooO0O0Arr = new OooO0O0[size];
                    oooOo00.f28367OooO0Oo.toArray(oooO0O0Arr);
                    oooOo00.f28367OooO0Oo.clear();
                }
                for (int i = 0; i < size; i++) {
                    OooO0O0 oooO0O0 = oooO0O0Arr[i];
                    int size2 = oooO0O0.f28371OooO0O0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        OooO0OO oooO0OO = oooO0O0.f28371OooO0O0.get(i2);
                        if (!oooO0OO.f28375OooO0Oo) {
                            oooO0OO.f28373OooO0O0.onReceive(oooOo00.f28364OooO00o, oooO0O0.f28370OooO00o);
                        }
                    }
                }
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f28370OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0OO> f28371OooO0O0;

        public OooO0O0(Intent intent, ArrayList<OooO0OO> arrayList) {
            this.f28370OooO00o = intent;
            this.f28371OooO0O0 = arrayList;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final IntentFilter f28372OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final BroadcastReceiver f28373OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f28374OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f28375OooO0Oo;

        public OooO0OO(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f28372OooO00o = intentFilter;
            this.f28373OooO0O0 = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f28373OooO0O0);
            sb.append(" filter=");
            sb.append(this.f28372OooO00o);
            if (this.f28375OooO0Oo) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public OooOo00(Context context) {
        this.f28364OooO00o = context;
        this.f28368OooO0o0 = new OooO00o(context.getMainLooper());
    }

    @NonNull
    public static OooOo00 OooO00o(@NonNull Context context) {
        OooOo00 oooOo00;
        synchronized (f28362OooO0o) {
            if (f28363OooO0oO == null) {
                f28363OooO0oO = new OooOo00(context.getApplicationContext());
            }
            oooOo00 = f28363OooO0oO;
        }
        return oooOo00;
    }

    public final void OooO0O0(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f28365OooO0O0) {
            OooO0OO oooO0OO = new OooO0OO(intentFilter, broadcastReceiver);
            ArrayList<OooO0OO> arrayList = this.f28365OooO0O0.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f28365OooO0O0.put(broadcastReceiver, arrayList);
            }
            arrayList.add(oooO0OO);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<OooO0OO> arrayList2 = this.f28366OooO0OO.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f28366OooO0OO.put(action, arrayList2);
                }
                arrayList2.add(oooO0OO);
            }
        }
    }

    public final boolean OooO0OO(@NonNull Intent intent) {
        boolean z;
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<OooO0OO> arrayList2;
        String str2;
        String str3;
        synchronized (this.f28365OooO0O0) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f28364OooO00o.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = (intent.getFlags() & 8) != 0;
            if (z2) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<OooO0OO> arrayList3 = this.f28366OooO0OO.get(intent.getAction());
            if (arrayList3 != null) {
                if (z2) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    OooO0OO oooO0OO = arrayList3.get(i2);
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + oooO0OO.f28372OooO00o);
                    }
                    if (oooO0OO.f28374OooO0OO) {
                        if (z2) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i = i2;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = oooO0OO.f28372OooO00o.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z2) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(oooO0OO);
                            oooO0OO.f28374OooO0OO = true;
                        } else if (z2) {
                            if (iMatch == -4) {
                                str3 = "category";
                            } else if (iMatch == -3) {
                                str3 = NativeProtocol.WEB_DIALOG_ACTION;
                            } else if (iMatch != -2) {
                                str3 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str3 = "data";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    arrayList4 = arrayList;
                    i2 = i + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                z = false;
                if (arrayList5 != null) {
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        ((OooO0OO) arrayList5.get(i3)).f28374OooO0OO = false;
                    }
                    this.f28367OooO0Oo.add(new OooO0O0(intent, arrayList5));
                    if (!this.f28368OooO0o0.hasMessages(1)) {
                        this.f28368OooO0o0.sendEmptyMessage(1);
                    }
                    return true;
                }
            } else {
                z = false;
            }
            return z;
        }
    }

    public final void OooO0Oo(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f28365OooO0O0) {
            ArrayList<OooO0OO> arrayListRemove = this.f28365OooO0O0.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                OooO0OO oooO0OO = arrayListRemove.get(size);
                oooO0OO.f28375OooO0Oo = true;
                for (int i = 0; i < oooO0OO.f28372OooO00o.countActions(); i++) {
                    String action = oooO0OO.f28372OooO00o.getAction(i);
                    ArrayList<OooO0OO> arrayList = this.f28366OooO0OO.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            OooO0OO oooO0OO2 = arrayList.get(size2);
                            if (oooO0OO2.f28373OooO0O0 == broadcastReceiver) {
                                oooO0OO2.f28375OooO0Oo = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f28366OooO0OO.remove(action);
                        }
                    }
                }
            }
        }
    }
}
