package com.yalla.yalla.developer.crash;

import Oooo000.o00O00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p254o00ooO0O.o00O000;
import p539o0o0Oo00.OooOO0;
import p617o0oo0o.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R4\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/developer/crash/CrashListViewModel;", "Lo00OO/OooO00o;", "", "loadCrashFiles", "clearFiles", "LOooooo0/o00OO0OO;", "Lkotlin/Pair;", "", "Ljava/io/File;", "listLiveData", "LOooooo0/o00OO0OO;", "getListLiveData", "()LOooooo0/o00OO0OO;", "setListLiveData", "(LOooooo0/o00OO0OO;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CrashListViewModel extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private o00OO0OO<Pair<String, File>> listLiveData = new o00OO0OO<>();

    @DebugMetadata(c = "com.yalla.yalla.developer.crash.CrashListViewModel$loadCrashFiles$1", f = "CrashListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CrashListViewModel.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CrashListViewModel.this.getListLiveData().clear();
            OooOO0 oooOO1 = OooOO0.f44125OooO00o;
            o00O000 o00o001 = o00O000.f34346OooO00o;
            String strOooO00o = oooOO1.OooO00o(o00O000.OooO00o());
            List<File> files = o00O00.OooOO0o(o00O00.OooOO0O(strOooO00o) ? null : new File(strOooO00o), new o0Oo0oo(), false);
            Intrinsics.checkNotNullExpressionValue(files, "files");
            CrashListViewModel crashListViewModel = CrashListViewModel.this;
            for (File file : files) {
                o00OO0OO<Pair<String, File>> listLiveData = crashListViewModel.getListLiveData();
                String strSubstring = "";
                if (file != null) {
                    String absolutePath = file.getAbsolutePath();
                    if (!o00O00.OooOO0O(absolutePath)) {
                        int iLastIndexOf = absolutePath.lastIndexOf(File.separator);
                        strSubstring = iLastIndexOf == -1 ? absolutePath : absolutePath.substring(iLastIndexOf + 1);
                    }
                }
                listLiveData.add(0, new Pair<>(strSubstring, file));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearFiles() {
        OooOO0 oooOO1 = OooOO0.f44125OooO00o;
        o00O000 o00o001 = o00O000.f34346OooO00o;
        String strOooO00o = oooOO1.OooO00o(o00O000.OooO00o());
        File file = o00O00.OooOO0O(strOooO00o) ? null : new File(strOooO00o);
        if (file != null) {
            if (file.isDirectory()) {
                o00O00.OooO0oo(file);
            } else if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
        loadCrashFiles();
    }

    @NotNull
    public final o00OO0OO<Pair<String, File>> getListLiveData() {
        return this.listLiveData;
    }

    public final void loadCrashFiles() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    public final void setListLiveData(@NotNull o00OO0OO<Pair<String, File>> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.listLiveData = o00oo0oo;
    }
}
