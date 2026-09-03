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
import o0000O0.o000oOoO;
import p190o00o0O.OooOo;
import p190o00o0O.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O f33484OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOo00<String, Typeface> f33485OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o extends FontsContractCompat$FontRequestCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final androidx.core.content.res.OooO00o.OooO f33486OooO00o;

        public OooO00o(@Nullable androidx.core.content.res.OooO00o.OooO oooO) {
            this.f33486OooO00o = oooO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f33484OooO00o = new o000oOoO();
        } else if (i >= 28) {
            f33484OooO00o = new Oooo0();
        } else if (i >= 26) {
            f33484OooO00o = new Oooo000();
        } else if (i < 24) {
            f33484OooO00o = new OooOo00();
        } else {
            Method method = OooOo.f33489OooO0OO;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f33484OooO00o = new OooOo();
            } else {
                f33484OooO00o = new OooOo00();
            }
        }
        f33485OooO0O0 = new OooOo00<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface OooO00o(@NonNull Context context, @NonNull FontResourcesParserCompat.OooO0O0 oooO0O0, @NonNull Resources resources, int i, @Nullable String str, int i2, int i3, @Nullable androidx.core.content.res.OooO00o.OooO oooO, boolean z) {
        Typeface typefaceOooO00o;
        Typeface typefaceCreate;
        if (oooO0O0 instanceof FontResourcesParserCompat.OooO) {
            FontResourcesParserCompat.OooO oooO2 = (FontResourcesParserCompat.OooO) oooO0O0;
            String str2 = oooO2.f5290OooO0Oo;
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
            if (!z ? oooO == null : oooO2.f5289OooO0OO == 0) {
                z2 = true;
            }
            int i4 = z ? oooO2.f5288OooO0O0 : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            OooO00o oooO00o = new OooO00o(oooO);
            OooOO0 oooOO1 = oooO2.f5287OooO00o;
            OooO0OO oooO0OO = new OooO0OO(oooO00o, handler);
            if (z2) {
                OooOo00<String, Typeface> oooOo00 = o0000O0.OooOo00.f33558OooO00o;
                String str3 = oooOO1.f33545OooO0o0 + "-" + i3;
                Typeface typeface = o0000O0.OooOo00.f33558OooO00o.get(str3);
                if (typeface != null) {
                    handler.post(new o0000O0.OooO00o(oooO00o, typeface));
                    typefaceOooO00o = typeface;
                } else if (i4 == -1) {
                    o0000O0.OooOo00.OooO00o OooO00o2 = o0000O0.OooOo00.OooO00o(str3, context, oooOO1, i3);
                    oooO0OO.OooO00o(OooO00o2);
                    typefaceOooO00o = OooO00o2.f33562OooO00o;
                } else {
                    try {
                        try {
                            try {
                                o0000O0.OooOo00.OooO00o oooO00o2 = (o0000O0.OooOo00.OooO00o) o0000O0.OooOo00.f33559OooO0O0.submit(new OooOO0O(str3, context, oooOO1, i3)).get(i4, TimeUnit.MILLISECONDS);
                                oooO0OO.OooO00o(oooO00o2);
                                typefaceOooO00o = oooO00o2.f33562OooO00o;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException e) {
                            throw e;
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        oooO0OO.f33540OooO0O0.post(new OooO0O0(oooO0OO.f33539OooO00o, -3));
                    }
                }
            } else {
                OooOo00<String, Typeface> oooOo01 = o0000O0.OooOo00.f33558OooO00o;
                String str4 = oooOO1.f33545OooO0o0 + "-" + i3;
                Typeface typeface2 = o0000O0.OooOo00.f33558OooO00o.get(str4);
                if (typeface2 != null) {
                    handler.post(new o0000O0.OooO00o(oooO00o, typeface2));
                    typefaceOooO00o = typeface2;
                } else {
                    OooOOO0 oooOOO0 = new OooOOO0(oooO0OO);
                    synchronized (o0000O0.OooOo00.f33560OooO0OO) {
                        OooOo<String, ArrayList<o000OO.OooO00o<o0000O0.OooOo00.OooO00o>>> oooOo = o0000O0.OooOo00.f33561OooO0Oo;
                        ArrayList<o000OO.OooO00o<o0000O0.OooOo00.OooO00o>> orDefault = oooOo.getOrDefault(str4, null);
                        if (orDefault != null) {
                            orDefault.add(oooOOO0);
                        } else {
                            ArrayList<o000OO.OooO00o<o0000O0.OooOo00.OooO00o>> arrayList = new ArrayList<>();
                            arrayList.add(oooOOO0);
                            oooOo.put(str4, arrayList);
                            o0000O0.OooOo00.f33559OooO0O0.execute(new o000oOoO(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new OooOOO(str4, context, oooOO1, i3), new o0000O0.OooOOOO(str4)));
                        }
                    }
                }
            }
        } else {
            typefaceOooO00o = f33484OooO00o.OooO00o(context, (FontResourcesParserCompat.OooO0OO) oooO0O0, resources, i3);
            if (oooO != null) {
                if (typefaceOooO00o != null) {
                    oooO.OooO0O0(typefaceOooO00o);
                } else {
                    oooO.OooO00o(-3);
                }
            }
        }
        if (typefaceOooO00o != null) {
            f33485OooO0O0.put(OooO0O0(resources, i, str, i2, i3), typefaceOooO00o);
        }
        return typefaceOooO00o;
    }

    public static String OooO0O0(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
