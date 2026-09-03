package p273o00ooooO;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270o00oooOo.a0;
import p272o00oooo0.o0O0o000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.apm.uploader.XLogFileUploader$upload$1", f = "XLogFileUploader.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class c0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f34976Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List f34977Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public e0 f34978Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Iterator f34979Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ e0 f34980OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Continuation<? super c0> continuation) {
        super(2, continuation);
        this.f34980OoooO00 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c0(this.f34980OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List files;
        e0 e0Var;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34976Oooo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function0<Unit> function0 = this.f34980OoooO00.f34989OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
            a0 a0Var = this.f34980OoooO00.f34991OooO0o;
            Objects.requireNonNull(a0Var);
            File file = new File(a0Var.f34962OooO00o);
            if (file.exists() && !file.isFile() && file.canRead()) {
                ArrayList arrayList = new ArrayList();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File it2 : fileArrListFiles) {
                        if (it2.isFile()) {
                            String name = it2.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "it.name");
                            if (StringsKt.OooOoOO(name, a0Var.f34963OooO0O0)) {
                                String name2 = it2.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "it.name");
                                if (StringsKt__StringsJVMKt.endsWith$default(name2, a0Var.f34964OooO0OO, false, 2, null) && it2.length() > 0) {
                                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                                    arrayList.add(it2);
                                }
                            }
                        }
                    }
                }
                files = arrayList;
            } else {
                files = CollectionsKt.emptyList();
            }
            if (files.isEmpty()) {
                Intrinsics.checkNotNullParameter("There is no log files under target path!", "error");
                if (o0O0o000.f34971OooO0Oo) {
                    o0O0o000.f34969OooO0O0.OooO00o(6, o0O0o000.f34970OooO0OO, "There is no log files under target path!");
                }
                return Unit.INSTANCE;
            }
            e0Var = this.f34980OoooO00;
            it = files.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f34979Oooo0oo;
            e0Var = this.f34978Oooo0oO;
            files = this.f34977Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            File file2 = (File) it.next();
            this.f34977Oooo0o = files;
            this.f34978Oooo0oO = e0Var;
            this.f34979Oooo0oo = it;
            this.f34976Oooo = 1;
            if (e0.OooO00o(e0Var, file2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Objects.requireNonNull(this.f34980OoooO00.f34991OooO0o);
        Intrinsics.checkNotNullParameter(files, "files");
        Iterator it3 = files.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        return Unit.INSTANCE;
    }
}
