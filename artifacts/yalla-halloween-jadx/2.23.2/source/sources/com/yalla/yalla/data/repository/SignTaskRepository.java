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
import p475o0Ooooo0.oO0O000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSignTaskRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignTaskRepository.kt\ncom/yalla/yalla/data/repository/SignTaskRepository\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,27:1\n62#2:28\n62#2:29\n62#2:30\n62#2:31\n62#2:32\n*S KotlinDebug\n*F\n+ 1 SignTaskRepository.kt\ncom/yalla/yalla/data/repository/SignTaskRepository\n*L\n14#1:28\n17#1:29\n20#1:30\n23#1:31\n26#1:32\n*E\n"})
public final class SignTaskRepository extends oO0O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final SignTaskRepository f22667OooO00o = new SignTaskRepository();

    @Nullable
    public static Object OooO0OO(int i, @NotNull Continuation continuation) {
        String strOooO0OO = oo000o.OooO0OO("/Webservers/Task/TaskList");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), "isdaily");
        return OooOOO.OooO0Oo(new SignTaskRepository$loadTaskListData$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }
}
