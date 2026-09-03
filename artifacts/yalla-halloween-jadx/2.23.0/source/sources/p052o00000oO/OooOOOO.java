package p052o00000oO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0000O0.OooO0O0;
import o0000O0.OooO0OO;
import o0000O0.OooOO0;
import o0000O0.OooOO0O;
import o0000O0.OooOOO;
import o0000O0.OooOOO0;
import o0000O0.OooOo00;
import o0000O0.o000oOoO;
import p188o00o0O.OooOo;
import p188o00o0O.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O f33996OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOo<String, Typeface> f33997OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o extends FontsContractCompat$FontRequestCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final androidx.core.content.res.OooO00o.OooO f33998OooO00o;

        public OooO00o(@Nullable androidx.core.content.res.OooO00o.OooO oooO) {
            this.f33998OooO00o = oooO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f33996OooO00o = new o000oOoO();
        } else if (i >= 28) {
            f33996OooO00o = new Oooo0();
        } else if (i >= 26) {
            f33996OooO00o = new Oooo000();
        } else if (i < 24) {
            f33996OooO00o = new OooOo00();
        } else {
            Method method = OooOo.f34001OooO0OO;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f33996OooO00o = new OooOo();
            } else {
                f33996OooO00o = new OooOo00();
            }
        }
        f33997OooO0O0 = new OooOo<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface OooO00o(@NonNull Context context, @NonNull FontResourcesParserCompat.OooO0O0 oooO0O0, @NonNull Resources resources, int i, @Nullable String str, int i2, int i3, @Nullable androidx.core.content.res.OooO00o.OooO oooO, boolean z) {
        Typeface typefaceOooO00o;
        Typeface typefaceCreate;
        if (oooO0O0 instanceof FontResourcesParserCompat.OooO) {
            FontResourcesParserCompat.OooO oooO2 = (FontResourcesParserCompat.OooO) oooO0O0;
            String str2 = oooO2.f5280OooO0Oo;
            typefaceOooO00o = null;
            boolean z2 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (oooO != null) {
                    oooO.OooO0O0(typefaceCreate);
                }
                return typefaceCreate;
            }
            if (!z ? oooO == null : oooO2.f5279OooO0OO == 0) {
                z2 = true;
            }
            int i4 = z ? oooO2.f5278OooO0O0 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            OooO00o oooO00o = new OooO00o(oooO);
            OooOO0 oooOO1 = oooO2.f5277OooO00o;
            OooO0OO oooO0OO = new OooO0OO(oooO00o, handler);
            if (z2) {
                OooOo<String, Typeface> oooOo = OooOo00.f34071OooO00o;
                String str3 = oooOO1.f34058OooO0o0 + "-" + i3;
                Typeface typeface = OooOo00.f34071OooO00o.get(str3);
                if (typeface != null) {
                    handler.post(new o0000O0.OooO00o(oooO00o, typeface));
                    typefaceOooO00o = typeface;
                } else if (i4 == -1) {
                    OooOo00.OooO00o OooO00o2 = OooOo00.OooO00o(str3, context, oooOO1, i3);
                    oooO0OO.OooO00o(OooO00o2);
                    typefaceOooO00o = OooO00o2.f34075OooO00o;
                } else {
                    try {
                        try {
                            try {
                                OooOo00.OooO00o oooO00o2 = (OooOo00.OooO00o) OooOo00.f34072OooO0O0.submit(new OooOO0O(str3, context, oooOO1, i3)).get(i4, TimeUnit.MILLISECONDS);
                                oooO0OO.OooO00o(oooO00o2);
                                typefaceOooO00o = oooO00o2.f34075OooO00o;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        oooO0OO.f34052OooO0O0.post(new OooO0O0(oooO0OO.f34051OooO00o, -3));
                    }
                }
            } else {
                OooOo<String, Typeface> oooOo2 = OooOo00.f34071OooO00o;
                String str4 = oooOO1.f34058OooO0o0 + "-" + i3;
                Typeface typeface2 = OooOo00.f34071OooO00o.get(str4);
                if (typeface2 != null) {
                    handler.post(new o0000O0.OooO00o(oooO00o, typeface2));
                    typefaceOooO00o = typeface2;
                } else {
                    OooOOO0 oooOOO0 = new OooOOO0(oooO0OO);
                    synchronized (OooOo00.f34073OooO0OO) {
                        Oooo000<String, ArrayList<o000OO.OooO00o<OooOo00.OooO00o>>> oooo000 = OooOo00.f34074OooO0Oo;
                        ArrayList<o000OO.OooO00o<OooOo00.OooO00o>> orDefault = oooo000.getOrDefault(str4, null);
                        if (orDefault != null) {
                            orDefault.add(oooOOO0);
                        } else {
                            ArrayList<o000OO.OooO00o<OooOo00.OooO00o>> arrayList = new ArrayList<>();
                            arrayList.add(oooOOO0);
                            oooo000.put(str4, arrayList);
                            OooOo00.f34072OooO0O0.execute(new o000oOoO(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new OooOOO(str4, context, oooOO1, i3), new o0000O0.OooOOOO(str4)));
                        }
                    }
                }
            }
        } else {
            typefaceOooO00o = f33996OooO00o.OooO00o(context, (FontResourcesParserCompat.OooO0OO) oooO0O0, resources, i3);
            if (oooO != null) {
                if (typefaceOooO00o != null) {
                    oooO.OooO0O0(typefaceOooO00o);
                } else {
                    oooO.OooO00o(-3);
                }
            }
        }
        if (typefaceOooO00o != null) {
            f33997OooO0O0.put(OooO0O0(resources, i, str, i2, i3), typefaceOooO00o);
        }
        return typefaceOooO00o;
    }

    public static String OooO0O0(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
