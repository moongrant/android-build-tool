package p071o000O0o;

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
import o000O0.OooO0O0;
import o000O0.OooO0OO;
import o000O0.OooOO0;
import o000O0.OooOO0O;
import o000O0.OooOOO;
import o000O0.OooOOOO;
import o000O0.OooOo00;
import o000O0.o000oOoO;
import p021OooOooo.o00oO0o;
import p021OooOooo.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Oooo0 f28175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo000o<String, Typeface> f28176OooO0O0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO00o extends FontsContractCompat$FontRequestCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public androidx.core.content.res.OooO00o.OooO f28177OooO00o;

        public OooO00o(@Nullable androidx.core.content.res.OooO00o.OooO oooO) {
            this.f28177OooO00o = oooO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f28175OooO00o = new Oooo000();
        } else if (i >= 28) {
            f28175OooO00o = new OooOo();
        } else if (i >= 26) {
            f28175OooO00o = new OooOo00();
        } else if (i < 24) {
            f28175OooO00o = new OooOOO();
        } else {
            Method method = OooOOOO.f28180OooO0Oo;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f28175OooO00o = new OooOOOO();
            } else {
                f28175OooO00o = new OooOOO();
            }
        }
        f28176OooO0O0 = new oo000o<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface OooO00o(@NonNull Context context, @NonNull FontResourcesParserCompat.OooO0O0 oooO0O0, @NonNull Resources resources, int i, @Nullable String str, int i2, int i3, @Nullable androidx.core.content.res.OooO00o.OooO oooO, boolean z) {
        Typeface typefaceOooO00o;
        Typeface typefaceCreate;
        if (oooO0O0 instanceof FontResourcesParserCompat.OooO) {
            FontResourcesParserCompat.OooO oooO2 = (FontResourcesParserCompat.OooO) oooO0O0;
            String str2 = oooO2.f7821OooO0Oo;
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
            if (!z ? oooO == null : oooO2.f7820OooO0OO == 0) {
                z2 = true;
            }
            int i4 = z ? oooO2.f7819OooO0O0 : -1;
            Handler handlerOooO0OO = androidx.core.content.res.OooO00o.OooO.OooO0OO();
            OooO00o oooO00o = new OooO00o(oooO);
            OooOO0 oooOO1 = oooO2.f7818OooO00o;
            OooO0OO oooO0OO = new OooO0OO(oooO00o, handlerOooO0OO);
            if (z2) {
                String strOooO00o = OooOo00.OooO00o(oooOO1, i3);
                Typeface typeface = OooOo00.f28066OooO00o.get(strOooO00o);
                if (typeface != null) {
                    handlerOooO0OO.post(new o000O0.OooO00o(oooO00o, typeface));
                    typefaceOooO00o = typeface;
                } else if (i4 == -1) {
                    OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0(strOooO00o, context, oooOO1, i3);
                    oooO0OO.OooO00o(oooO00oOooO0O0);
                    typefaceOooO00o = oooO00oOooO0O0.f28070OooO00o;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    OooOo00.OooO00o oooO00o2 = (OooOo00.OooO00o) OooOo00.f28067OooO0O0.submit(new OooOO0O(strOooO00o, context, oooOO1, i3)).get(i4, TimeUnit.MILLISECONDS);
                                    oooO0OO.OooO00o(oooO00o2);
                                    typefaceOooO00o = oooO00o2.f28070OooO00o;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        oooO0OO.f28047OooO0O0.post(new OooO0O0(oooO0OO.f28046OooO00o, -3));
                    }
                }
            } else {
                String strOooO00o2 = OooOo00.OooO00o(oooOO1, i3);
                Typeface typeface2 = OooOo00.f28066OooO00o.get(strOooO00o2);
                if (typeface2 != null) {
                    handlerOooO0OO.post(new o000O0.OooO00o(oooO00o, typeface2));
                    typefaceOooO00o = typeface2;
                } else {
                    o000O0.OooOOO0 oooOOO0 = new o000O0.OooOOO0(oooO0OO);
                    synchronized (OooOo00.f28068OooO0OO) {
                        o00oO0o<String, ArrayList<o000OO0O.OooO00o<OooOo00.OooO00o>>> o00oo0o2 = OooOo00.f28069OooO0Oo;
                        ArrayList<o000OO0O.OooO00o<OooOo00.OooO00o>> orDefault = o00oo0o2.getOrDefault(strOooO00o2, null);
                        if (orDefault != null) {
                            orDefault.add(oooOOO0);
                        } else {
                            ArrayList<o000OO0O.OooO00o<OooOo00.OooO00o>> arrayList = new ArrayList<>();
                            arrayList.add(oooOOO0);
                            o00oo0o2.put(strOooO00o2, arrayList);
                            OooOo00.f28067OooO0O0.execute(new o000oOoO(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new OooOOO(strOooO00o2, context, oooOO1, i3), new OooOOOO(strOooO00o2)));
                        }
                    }
                }
            }
        } else {
            typefaceOooO00o = f28175OooO00o.OooO00o(context, (FontResourcesParserCompat.OooO0OO) oooO0O0, resources, i3);
            if (oooO != null) {
                if (typefaceOooO00o != null) {
                    oooO.OooO0O0(typefaceOooO00o);
                } else {
                    oooO.OooO00o(-3);
                }
            }
        }
        if (typefaceOooO00o != null) {
            f28176OooO0O0.put(OooO0OO(resources, i, str, i2, i3), typefaceOooO00o);
        }
        return typefaceOooO00o;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface OooO0O0(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceOooO0Oo = f28175OooO00o.OooO0Oo(context, resources, i, str, i3);
        if (typefaceOooO0Oo != null) {
            f28176OooO0O0.put(OooO0OO(resources, i, str, i2, i3), typefaceOooO0Oo);
        }
        return typefaceOooO0Oo;
    }

    public static String OooO0OO(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
