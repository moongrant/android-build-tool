package p066o0000oOo;

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
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f34308OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static o0Oo0oo f34309OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f34310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<OooO0OO>> f34311OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap<String, ArrayList<OooO0OO>> f34312OooO0OO = new HashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<OooO0O0> f34313OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f34314OooO0o0;

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
            o0Oo0oo o0oo0oo2 = o0Oo0oo.this;
            while (true) {
                synchronized (o0oo0oo2.f34311OooO0O0) {
                    size = o0oo0oo2.f34313OooO0Oo.size();
                    if (size <= 0) {
                        return;
                    }
                    oooO0O0Arr = new OooO0O0[size];
                    o0oo0oo2.f34313OooO0Oo.toArray(oooO0O0Arr);
                    o0oo0oo2.f34313OooO0Oo.clear();
                }
                for (int i = 0; i < size; i++) {
                    OooO0O0 oooO0O0 = oooO0O0Arr[i];
                    int size2 = oooO0O0.f34317OooO0O0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        OooO0OO oooO0OO = oooO0O0.f34317OooO0O0.get(i2);
                        if (!oooO0OO.f34321OooO0Oo) {
                            oooO0OO.f34319OooO0O0.onReceive(o0oo0oo2.f34310OooO00o, oooO0O0.f34316OooO00o);
                        }
                    }
                }
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f34316OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<OooO0OO> f34317OooO0O0;

        public OooO0O0(Intent intent, ArrayList<OooO0OO> arrayList) {
            this.f34316OooO00o = intent;
            this.f34317OooO0O0 = arrayList;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final IntentFilter f34318OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final BroadcastReceiver f34319OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f34320OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f34321OooO0Oo;

        public OooO0OO(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f34318OooO00o = intentFilter;
            this.f34319OooO0O0 = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f34319OooO0O0);
            sb.append(" filter=");
            sb.append(this.f34318OooO00o);
            if (this.f34321OooO0Oo) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public o0Oo0oo(Context context) {
        this.f34310OooO00o = context;
        this.f34314OooO0o0 = new OooO00o(context.getMainLooper());
    }

    @NonNull
    public static o0Oo0oo OooO00o(@NonNull Context context) {
        o0Oo0oo o0oo0oo2;
        synchronized (f34308OooO0o) {
            if (f34309OooO0oO == null) {
                f34309OooO0oO = new o0Oo0oo(context.getApplicationContext());
            }
            o0oo0oo2 = f34309OooO0oO;
        }
        return o0oo0oo2;
    }

    public final void OooO0O0(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f34311OooO0O0) {
            OooO0OO oooO0OO = new OooO0OO(broadcastReceiver, intentFilter);
            ArrayList<OooO0OO> arrayList = this.f34311OooO0O0.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f34311OooO0O0.put(broadcastReceiver, arrayList);
            }
            arrayList.add(oooO0OO);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<OooO0OO> arrayList2 = this.f34312OooO0OO.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f34312OooO0OO.put(action, arrayList2);
                }
                arrayList2.add(oooO0OO);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0OO(@NonNull Intent intent) {
        ArrayList<OooO0OO> arrayList;
        int i;
        String str;
        boolean z;
        String str2;
        synchronized (this.f34311OooO0O0) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f34310OooO00o.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z2 = true;
            boolean z3 = false;
            Object[] objArr = (intent.getFlags() & 8) != 0;
            if (objArr != false) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<OooO0OO> arrayList2 = this.f34312OooO0OO.get(intent.getAction());
            if (arrayList2 != null) {
                if (objArr != false) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                }
                ArrayList arrayList3 = null;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    OooO0OO oooO0OO = arrayList2.get(i2);
                    if (objArr != false) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + oooO0OO.f34318OooO00o);
                    }
                    if (oooO0OO.f34320OooO0OO) {
                        if (objArr != false) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        arrayList = arrayList2;
                        i = i2;
                        str = action;
                        z = z2;
                    } else {
                        String str3 = action;
                        arrayList = arrayList2;
                        i = i2;
                        str = action;
                        z = z2;
                        int iMatch = oooO0OO.f34318OooO00o.match(str3, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (objArr != false) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(oooO0OO);
                            oooO0OO.f34320OooO0OO = z;
                        } else if (objArr != false) {
                            if (iMatch == -4) {
                                str2 = "category";
                            } else if (iMatch == -3) {
                                str2 = NativeProtocol.WEB_DIALOG_ACTION;
                            } else if (iMatch != -2) {
                                str2 = iMatch != -1 ? "unknown reason" : "type";
                            } else {
                                str2 = "data";
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                        }
                    }
                    i2 = i + 1;
                    z2 = z;
                    arrayList2 = arrayList;
                    action = str;
                    z3 = false;
                }
                boolean z4 = z2;
                if (arrayList3 != null) {
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        ((OooO0OO) arrayList3.get(i3)).f34320OooO0OO = false;
                    }
                    this.f34313OooO0Oo.add(new OooO0O0(intent, arrayList3));
                    if (!this.f34314OooO0o0.hasMessages(z4 ? 1 : 0)) {
                        this.f34314OooO0o0.sendEmptyMessage(z4 ? 1 : 0);
                    }
                }
            }
        }
    }

    public final void OooO0Oo(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f34311OooO0O0) {
            ArrayList<OooO0OO> arrayListRemove = this.f34311OooO0O0.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                OooO0OO oooO0OO = arrayListRemove.get(size);
                oooO0OO.f34321OooO0Oo = true;
                for (int i = 0; i < oooO0OO.f34318OooO00o.countActions(); i++) {
                    String action = oooO0OO.f34318OooO00o.getAction(i);
                    ArrayList<OooO0OO> arrayList = this.f34312OooO0OO.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            OooO0OO oooO0OO2 = arrayList.get(size2);
                            if (oooO0OO2.f34319OooO0O0 == broadcastReceiver) {
                                oooO0OO2.f34321OooO0Oo = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f34312OooO0OO.remove(action);
                        }
                    }
                }
            }
        }
    }
}
