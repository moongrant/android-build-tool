package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentRepository.kt\ncom/yalla/yalla/data/repository/MomentRepository\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,404:1\n62#2:405\n62#2:406\n62#2:407\n62#2:408\n62#2:409\n62#2:410\n62#2:411\n62#2:412\n62#2:413\n62#2:414\n62#2:415\n62#2:416\n62#2:417\n62#2:418\n62#2:419\n62#2:420\n62#2:421\n62#2:422\n62#2:423\n62#2:424\n62#2:425\n62#2:426\n62#2:427\n62#2:428\n62#2:429\n62#2:430\n62#2:431\n62#2:432\n62#2:433\n62#2:434\n62#2:435\n62#2:436\n62#2:437\n62#2:438\n62#2:439\n62#2:440\n*S KotlinDebug\n*F\n+ 1 MomentRepository.kt\ncom/yalla/yalla/data/repository/MomentRepository\n*L\n46#1:405\n55#1:406\n66#1:407\n79#1:408\n86#1:409\n95#1:410\n118#1:411\n136#1:412\n144#1:413\n153#1:414\n165#1:415\n171#1:416\n184#1:417\n191#1:418\n200#1:419\n210#1:420\n223#1:421\n230#1:422\n240#1:423\n248#1:424\n256#1:425\n269#1:426\n279#1:427\n286#1:428\n297#1:429\n306#1:430\n313#1:431\n322#1:432\n330#1:433\n336#1:434\n343#1:435\n351#1:436\n355#1:437\n365#1:438\n373#1:439\n401#1:440\n*E\n"})
public final class MomentRepository {
    @Nullable
    public static Object OooO00o(int i, int i2, long j, long j2, @NotNull Continuation continuation) {
        if (j2 <= 0) {
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Comment/List");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), "sortType");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            return OooOOO.OooO0Oo(new MomentRepository$momentCommentList$$inlined$call$2(o0oooooOooO00o, null), continuation);
        }
        String strOooO0Oo2 = oo000o.OooO0Oo("/Webservers/Comment/List");
        o0ooOOo o0oooooOooO00o2 = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo2, "url", strOooO0Oo2, 0);
        o0oooooOooO00o2.OooO0O0(Boxing.boxLong(j), "dyid");
        o0oooooOooO00o2.OooO0O0(Boxing.boxInt(i), "sortType");
        o0oooooOooO00o2.OooO0O0(Boxing.boxLong(j2), "datesort");
        o0oooooOooO00o2.OooO0O0(Boxing.boxInt(i2), "pageindex");
        o0oooooOooO00o2.OooO0O0(Boxing.boxInt(20), "pagesize");
        return OooOOO.OooO0Oo(new MomentRepository$momentCommentList$$inlined$call$1(o0oooooOooO00o2, null), continuation);
    }

    @Nullable
    public static Object OooO0O0(long j, long j2, long j3, int i, long j4, int i2, @NotNull Continuation continuation) {
        String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Comment/SonList");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "dyid");
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j2), "dyuserid");
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j3), "cid");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), "sortType");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
        if (j4 > 0) {
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(j4), "datesort");
        }
        return OooOOO.OooO0Oo(new MomentRepository$momentReplyList$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }

    @Nullable
    public static Object OooO0OO(long j, long j2, int i, int i2, int i3, @NotNull Continuation continuation) {
        String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Discovery/SquarePersonal");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "toUserId");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i3), "type");
        o0oooooOooO00o.OooO0O0(Boxing.boxLong(j2), "datesort");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), "pageindex");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "sourceType");
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
        return OooOOO.OooO0Oo(new MomentRepository$newUserMomentList$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }

    @Nullable
    public static Object OooO0Oo(long j, long j2, int i, @NotNull Continuation continuation) {
        if (j2 <= 0) {
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/PraiseList");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "dyid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            return OooOOO.OooO0Oo(new MomentRepository$praiseList$$inlined$call$2(o0oooooOooO00o, null), continuation);
        }
        String strOooO0Oo2 = oo000o.OooO0Oo("/Webservers/Moment/PraiseList");
        o0ooOOo o0oooooOooO00o2 = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo2, "url", strOooO0Oo2, 0);
        o0oooooOooO00o2.OooO0O0(Boxing.boxLong(j), "dyid");
        o0oooooOooO00o2.OooO0O0(Boxing.boxLong(j2), "datesort");
        o0oooooOooO00o2.OooO0O0(Boxing.boxInt(i), "pageindex");
        o0oooooOooO00o2.OooO0O0(Boxing.boxInt(20), "pagesize");
        return OooOOO.OooO0Oo(new MomentRepository$praiseList$$inlined$call$1(o0oooooOooO00o2, null), continuation);
    }
}
