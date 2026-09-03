package p182o00o000O;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.cloudfilemanager.CloudFileManager$uploadFiles$2", f = "CloudFileManager.kt", i = {1, 1, 1, 1, 1, 1}, l = {109, 124}, m = "invokeSuspend", n = {"uploadInfo", "uploadRequest", "mutableList", ShareInternalUtility.STAGING_PARAM, "uploadResult", "index$iv"}, s = {"L$0", "L$1", "L$2", "L$7", "L$8", "I$0"})
@SourceDebugExtension({"SMAP\nCloudFileManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFiles$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1864#2,3:192\n1#3:195\n*S KotlinDebug\n*F\n+ 1 CloudFileManager.kt\ncom/code/android/cloudfilemanager/CloudFileManager$uploadFiles$2\n*L\n114#1:192,3\n*E\n"})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<OooO0o>>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Boolean f38438OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo000 f38439OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List f38440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oo00oO.OooO00o f38441OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOO0O f38442OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Object f38443OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Iterator f38444OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public File f38445OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f38446OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f38447OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f38448OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f38449OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ List<File> f38450OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ Object f38451OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ OooOO0O<Object> f38452OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final /* synthetic */ Long f38453OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final /* synthetic */ boolean f38454OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final /* synthetic */ Boolean f38455OooOo00;

    public static final class OooO00o extends Lambda implements Function3<Integer, Integer, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f38456OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o oooO0o) {
            super(3);
            this.f38456OooO0Oo = oooO0o;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Integer num2, Long l) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            long jLongValue = l.longValue();
            OooO0o oooO0o = this.f38456OooO0Oo;
            oooO0o.f38406OooO0Oo = iIntValue;
            oooO0o.f38408OooO0o0 = iIntValue2;
            oooO0o.f38407OooO0o = jLongValue;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooOO0O oooOO0O, Boolean bool, Long l, Object obj, List list, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f38450OooOOOo = list;
        this.f38452OooOOo0 = oooOO0O;
        this.f38451OooOOo = obj;
        this.f38453OooOOoo = l;
        this.f38455OooOo00 = bool;
        this.f38454OooOo0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        List<File> list = this.f38450OooOOOo;
        OooOO0O<Object> oooOO0O = this.f38452OooOOo0;
        Object obj2 = this.f38451OooOOo;
        return new OooOo(oooOO0O, this.f38455OooOo00, this.f38453OooOOoo, obj2, list, continuation, this.f38454OooOo0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<OooO0o>> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f7 -> B:100:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x011f -> B:52:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p182o00o000O.OooOo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
