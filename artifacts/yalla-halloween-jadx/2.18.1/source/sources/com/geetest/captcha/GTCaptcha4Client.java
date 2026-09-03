package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GTCaptcha4Client implements NoProguard {
    private final GTCaptcha4Holder a;

    public interface OnFailureListener extends NoProguard {
        void onFailure(String str);
    }

    public interface OnSuccessListener extends NoProguard {
        void onSuccess(boolean z, String str);
    }

    public interface OnWebViewShowListener extends NoProguard {
        void onWebViewShow();
    }

    private GTCaptcha4Client(Context context) {
        this.a = new GTCaptcha4Holder(context);
    }

    public static GTCaptcha4Client getClient(Context context) {
        return new GTCaptcha4Client(context);
    }

    public static String getVersion() {
        return "1.7.6";
    }

    public static Pair<Boolean, String> isSupportWebView(Context context) {
        GTCaptcha4Holder.a aVar = GTCaptcha4Holder.f;
        return GTCaptcha4Holder.a.a(context);
    }

    public final GTCaptcha4Client addOnFailureListener(OnFailureListener onFailureListener) {
        this.a.c = onFailureListener;
        return this;
    }

    public final GTCaptcha4Client addOnSuccessListener(OnSuccessListener onSuccessListener) {
        this.a.b = onSuccessListener;
        return this;
    }

    public final GTCaptcha4Client addOnWebViewShowListener(OnWebViewShowListener onWebViewShowListener) {
        this.a.d = onWebViewShowListener;
        return this;
    }

    public final void configurationChanged(Configuration configuration) {
        d dVar;
        try {
            o oVar = this.a.a.f;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
            }
            c cVar = oVar.d;
            if (cVar == null || (dVar = cVar.a) == null) {
                return;
            }
            dVar.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void destroy() {
        GTCaptcha4Holder.a();
    }

    public final GTCaptcha4Client init(String str) {
        this.a.a(str, null);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01da  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:77:0x021f  */
    /* JADX WARN: Code duplicated, block: B:80:0x022a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0231  */
    public final GTCaptcha4Client verifyWithCaptcha() throws JSONException {
        String str;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        p pVar;
        o oVar6;
        GTCaptcha4Holder gTCaptcha4Holder = this.a;
        if (System.currentTimeMillis() - GTCaptcha4Holder.e < 1000) {
            ag agVar = ag.a;
            ag.b("The interval between the two captcha is at least 1 second.");
        } else {
            GTCaptcha4Holder.e = System.currentTimeMillis();
            b bVar = gTCaptcha4Holder.a;
            OnSuccessListener onSuccessListener = gTCaptcha4Holder.b;
            bVar.b = onSuccessListener;
            OnFailureListener onFailureListener = gTCaptcha4Holder.c;
            bVar.c = onFailureListener;
            bVar.d = gTCaptcha4Holder.d;
            Context context = bVar.h;
            if (onFailureListener == null) {
                throw new IllegalArgumentException("The OnFailureListener object cannot be null.".toString());
            }
            boolean z = false;
            if (onSuccessListener == null) {
                u.a aVar = u.a;
                String str2 = v.FLOWING.getType() + ac.a.PARAM.getType() + "70";
                ad adVar = ad.a;
                String strC = ad.c();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The GTC4SessionResponse object cannot be null");
                String strA = u.a.a(str2, strC, jSONObject).a();
                ag agVar2 = ag.a;
                ag.b(strA);
                OnFailureListener onFailureListener2 = bVar.c;
                if (onFailureListener2 != null) {
                    onFailureListener2.onFailure(strA);
                }
            } else if (context == null) {
                u.a aVar2 = u.a;
                String str3 = v.FLOWING.getType() + ac.a.PARAM.getType() + "71";
                ad adVar2 = ad.a;
                String strC2 = ad.c();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("description", "The context parameter should not be null");
                String strA2 = u.a.a(str3, strC2, jSONObject2).a();
                ag agVar3 = ag.a;
                ag.b(strA2);
                OnFailureListener onFailureListener3 = bVar.c;
                if (onFailureListener3 != null) {
                    onFailureListener3.onFailure(strA2);
                }
            } else if (context instanceof Activity) {
                String str4 = bVar.a;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appId");
                }
                if (TextUtils.isEmpty(str4)) {
                    u.a aVar3 = u.a;
                    String str5 = v.FLOWING.getType() + ac.a.PARAM.getType() + "74";
                    ad adVar3 = ad.a;
                    String strC3 = ad.c();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("description", "The 'AppId' parameter should not be null");
                    String strA3 = u.a.a(str5, strC3, jSONObject3).a();
                    ag agVar4 = ag.a;
                    ag.b(strA3);
                    OnFailureListener onFailureListener4 = bVar.c;
                    if (onFailureListener4 != null) {
                        onFailureListener4.onFailure(strA3);
                    }
                } else {
                    z = true;
                }
            } else {
                u.a aVar4 = u.a;
                String str6 = v.FLOWING.getType() + ac.a.PARAM.getType() + "72";
                ad adVar4 = ad.a;
                String strC4 = ad.c();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("description", "The context must be an 'Activity' object");
                String strA4 = u.a.a(str6, strC4, jSONObject4).a();
                ag agVar5 = ag.a;
                ag.b(strA4);
                OnFailureListener onFailureListener5 = bVar.c;
                if (onFailureListener5 != null) {
                    onFailureListener5.onFailure(strA4);
                }
            }
            if (z) {
                o oVar7 = bVar.f;
                if (oVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("request");
                }
                v.a aVar5 = oVar7.a;
                v.a aVar6 = v.a.NONE;
                if (aVar5 == aVar6) {
                    bVar.g = new p();
                    Context context2 = bVar.h;
                    t.a aVar7 = t.j;
                    str = bVar.a;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appId");
                    }
                    o oVar8 = new o(context2, t.a.a(str, bVar.e));
                    bVar.f = oVar8;
                    oVar8.a(aVar6);
                    oVar = bVar.f;
                    if (oVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    oVar.a(v.FLOWING);
                    oVar2 = bVar.f;
                    if (oVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    oVar2.d = new c();
                    oVar3 = bVar.f;
                    if (oVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    oVar3.e = bVar.b;
                    oVar4 = bVar.f;
                    if (oVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    oVar4.f = bVar.c;
                    oVar5 = bVar.f;
                    if (oVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    oVar5.g = bVar.d;
                    pVar = bVar.g;
                    if (pVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
                    }
                    oVar6 = bVar.f;
                    if (oVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    pVar.b(oVar6);
                } else {
                    o oVar9 = bVar.f;
                    if (oVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("request");
                    }
                    if (oVar9.b == v.NONE) {
                        o oVar10 = bVar.f;
                        if (oVar10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar10.a(v.FLOWING);
                        o oVar11 = bVar.f;
                        if (oVar11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar11.e = bVar.b;
                        o oVar12 = bVar.f;
                        if (oVar12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar12.f = bVar.c;
                        o oVar13 = bVar.f;
                        if (oVar13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar13.g = bVar.d;
                        p pVar2 = bVar.g;
                        if (pVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
                        }
                        o oVar14 = bVar.f;
                        if (oVar14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        pVar2.b(oVar14);
                    } else {
                        bVar.g = new p();
                        Context context3 = bVar.h;
                        t.a aVar8 = t.j;
                        str = bVar.a;
                        if (str == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("appId");
                        }
                        o oVar15 = new o(context3, t.a.a(str, bVar.e));
                        bVar.f = oVar15;
                        oVar15.a(aVar6);
                        oVar = bVar.f;
                        if (oVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar.a(v.FLOWING);
                        oVar2 = bVar.f;
                        if (oVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar2.d = new c();
                        oVar3 = bVar.f;
                        if (oVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar3.e = bVar.b;
                        oVar4 = bVar.f;
                        if (oVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar4.f = bVar.c;
                        oVar5 = bVar.f;
                        if (oVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        oVar5.g = bVar.d;
                        pVar = bVar.g;
                        if (pVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
                        }
                        oVar6 = bVar.f;
                        if (oVar6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("request");
                        }
                        pVar.b(oVar6);
                    }
                }
            }
        }
        return this;
    }

    public final GTCaptcha4Client init(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.a.a(str, gTCaptcha4Config);
        return this;
    }
}
