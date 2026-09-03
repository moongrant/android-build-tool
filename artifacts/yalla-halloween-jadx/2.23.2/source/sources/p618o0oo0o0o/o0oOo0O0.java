package p618o0oo0o0o;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.mix.EvaSrc;
import com.yy.yyeva.mix.OooO00o;
import com.yy.yyeva.mix.OooO0O0;
import com.yy.yyeva.mix.OooO0OO;
import com.yy.yyeva.mix.OooO0o;
import com.yy.yyeva.util.EvaJniUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p612o0oo0OoO.o5;
import p612o0oo0OoO.r5;
import p615o0oo0o0.o0OoOo0;
import p617o0oo0o0O.o0O0o000;
import p617o0oo0o0O.o0O0o00O;
import p620o0oo0oO0.o000O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEvaAnimPluginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaAnimPluginManager.kt\ncom/yy/yyeva/plugin/EvaAnimPluginManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1855#2,2:108\n1855#2,2:110\n1855#2,2:112\n1855#2,2:114\n1855#2,2:116\n1855#2,2:118\n1855#2,2:120\n*S KotlinDebug\n*F\n+ 1 EvaAnimPluginManager.kt\ncom/yy/yyeva/plugin/EvaAnimPluginManager\n*L\n36#1:108,2\n49#1:110,2\n57#1:112,2\n81#1:114,2\n89#1:116,2\n96#1:118,2\n102#1:120,2\n*E\n"})
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final r5 f57549OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f57550OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<OooO00o> f57551OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f57553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f57554OooO0o0;

    public o0oOo0O0(@NotNull r5 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57549OooO00o = playerEva;
        OooO00o oooO00o = new OooO00o(playerEva);
        this.f57550OooO0O0 = oooO00o;
        this.f57551OooO0OO = CollectionsKt.listOf(oooO00o);
    }

    public final int OooO00o(@NotNull o5 config) {
        int i;
        boolean z;
        HashMap<String, EvaSrc> map;
        Collection<EvaSrc> collectionValues;
        HashMap<String, EvaSrc> map2;
        Collection<EvaSrc> collectionValues2;
        HashMap<String, EvaSrc> map3;
        Collection<EvaSrc> collectionValues3;
        HashMap<String, EvaSrc> map4;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onConfigCreateEva", "msg");
        Iterator<T> it = this.f57551OooO0OO.iterator();
        do {
            i = 0;
            if (!it.hasNext()) {
                return 0;
            }
            OooO00o oooO00o = (OooO00o) it.next();
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            if (config.f57429OooOO0) {
                if (oooO00o.f32425OooO0O0 != null) {
                    ArrayList arrayList = config.f57424OooO0Oo;
                    if (arrayList != null) {
                        oooO00o.f32426OooO0OO = new OooO0o(arrayList);
                    }
                    ArrayList datas = config.f57426OooO0o0;
                    if (datas != null) {
                        Intrinsics.checkNotNullParameter(datas, "datas");
                        SparseArray sparseArray = new SparseArray();
                        Iterator it2 = datas.iterator();
                        while (it2.hasNext()) {
                            o0O0o000 o0o0o000 = new o0O0o000((o5.OooO0O0) it2.next());
                            sparseArray.put(o0o0o000.f57545OooO00o, o0o0o000);
                        }
                    }
                    oooO00o.f32424OooO00o.f57461OooO0O0 = EvaJniUtil.f32437OooO00o.mixConfigCreate(oooO00o.f32424OooO00o.f57461OooO0O0, String.valueOf(config.f57420OooO));
                    synchronized (oooO00o.f32428OooO0o) {
                        oooO00o.f32430OooO0oO = false;
                        Unit unit = Unit.INSTANCE;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    OooO0o oooO0o = oooO00o.f32426OooO0OO;
                    int size = (oooO0o == null || (map4 = oooO0o.f32436OooO00o) == null) ? 0 : map4.size();
                    String msg = "load resource totalSrc = " + size;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    oooO00o.f32427OooO0Oo = 0;
                    OooO0o oooO0o2 = oooO00o.f32426OooO0OO;
                    if (oooO0o2 != null && (map3 = oooO0o2.f32436OooO00o) != null && (collectionValues3 = map3.values()) != null) {
                        for (EvaSrc src : collectionValues3) {
                            EvaSrc.SrcType srcType = src.f32415OooO0Oo;
                            if (srcType == EvaSrc.SrcType.IMG) {
                                String msg2 = "fetch image " + src.f32412OooO00o;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg2, "msg");
                                o0OoOo0 o0oooo1 = oooO00o.f32425OooO0O0;
                                if (o0oooo1 != null) {
                                    Intrinsics.checkNotNullExpressionValue(src, "src");
                                    o0oooo1.setImage(new OooO0OO(src), new OooO0O0(src, oooO00o));
                                }
                            } else if (srcType == EvaSrc.SrcType.TXT) {
                                String msg3 = "fetch txt " + src.f32412OooO00o;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg3, "msg");
                                o0OoOo0 o0oooo2 = oooO00o.f32425OooO0O0;
                                if (o0oooo2 != null) {
                                    Intrinsics.checkNotNullExpressionValue(src, "src");
                                    o0oooo2.setText(new OooO0OO(src), new o0O0o00O(src, oooO00o));
                                }
                            }
                        }
                    }
                    synchronized (oooO00o.f32428OooO0o) {
                        while (oooO00o.f32427OooO0Oo < size && !oooO00o.f32430OooO0oO) {
                            oooO00o.f32428OooO0o.wait();
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    String msg4 = "setResourceSync cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms";
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg4, "msg");
                    try {
                        OooO0o oooO0o3 = oooO00o.f32426OooO0OO;
                        if (oooO0o3 != null && (map2 = oooO0o3.f32436OooO00o) != null && (collectionValues2 = map2.values()) != null) {
                            for (EvaSrc src2 : collectionValues2) {
                                if (src2.f32415OooO0Oo == EvaSrc.SrcType.TXT) {
                                    Intrinsics.checkNotNullExpressionValue(src2, "src");
                                    src2.f32419OooO0oo = o000O00.OooO00o(src2);
                                }
                            }
                        }
                        z = true;
                    } catch (OutOfMemoryError tr) {
                        String msg5 = "draw text OOM " + tr;
                        Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter(msg5, "msg");
                        Intrinsics.checkNotNullParameter(tr, "tr");
                        z = false;
                    }
                    if (!z) {
                        i = 10006;
                        break;
                    }
                    String msg6 = "load resource " + oooO00o.f32427OooO0Oo;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg6, "msg");
                    OooO0o oooO0o4 = oooO00o.f32426OooO0OO;
                    if (oooO0o4 != null && (map = oooO0o4.f32436OooO00o) != null && (collectionValues = map.values()) != null) {
                        for (EvaSrc evaSrc : collectionValues) {
                            Bitmap bitmap = evaSrc.f32419OooO0oo;
                            if (bitmap == null) {
                                String msg7 = "missing src " + evaSrc;
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg7, "msg");
                            } else if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
                                String msg8 = "src " + evaSrc + " bitmap must not be ALPHA_8";
                                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                                Intrinsics.checkNotNullParameter(msg8, "msg");
                            }
                            i = 10006;
                            break;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("IFetchResource is empty", "msg");
                }
            }
        } while (i == 0);
        return i;
    }

    public final void OooO0O0(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        Iterator<T> it = this.f57551OooO0OO.iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).getClass();
            Intrinsics.checkNotNullParameter(ev, "ev");
            Intrinsics.checkNotNullParameter(ev, "ev");
        }
    }

    public final void OooO0OO() {
        HashMap<String, EvaSrc> map;
        Collection<EvaSrc> collectionValues;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onRelease", "msg");
        for (OooO00o oooO00o : this.f57551OooO0OO) {
            o5 o5Var = oooO00o.f32424OooO00o.f57482OooOo0o.f57454OooO0O0;
            if (!((o5Var == null || o5Var.f57429OooOO0) ? false : true)) {
                ArrayList arrayList = new ArrayList();
                OooO0o oooO0o = oooO00o.f32426OooO0OO;
                if (oooO0o != null && (map = oooO0o.f32436OooO00o) != null && (collectionValues = map.values()) != null) {
                    for (EvaSrc src : collectionValues) {
                        Intrinsics.checkNotNullExpressionValue(src, "src");
                        arrayList.add(new OooO0OO(src));
                    }
                }
                o0OoOo0 o0oooo1 = oooO00o.f32425OooO0O0;
                if (o0oooo1 != null) {
                    o0oooo1.releaseSrc(arrayList);
                }
            }
        }
    }

    public final void OooO0Oo() {
        o5 o5Var = this.f57549OooO00o.f57482OooOo0o.f57454OooO0O0;
        if ((o5Var == null || o5Var.f57429OooOO0) ? false : true) {
            return;
        }
        if (this.f57554OooO0o0 > this.f57552OooO0Oo + 1 || this.f57553OooO0o >= 4) {
            String msg = "jump frameIndex= " + this.f57552OooO0Oo + ",decodeIndex=" + this.f57554OooO0o0 + ",frameDiffTimes=" + this.f57553OooO0o;
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.f57552OooO0Oo = this.f57554OooO0o0;
        }
        if (this.f57554OooO0o0 != this.f57552OooO0Oo) {
            this.f57553OooO0o++;
        } else {
            this.f57553OooO0o = 0;
        }
        String msg2 = "onRendering frameIndex=" + this.f57552OooO0Oo;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg2, "msg");
        for (OooO00o oooO00o : this.f57551OooO0OO) {
            int i = this.f57552OooO0Oo;
            oooO00o.getClass();
            EvaJniUtil.f32437OooO00o.mixRendering(oooO00o.f32424OooO00o.f57461OooO0O0, i);
        }
        this.f57552OooO0Oo++;
    }
}
