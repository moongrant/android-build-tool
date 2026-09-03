package p590o0oOooo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.SystemConversationModel;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ArrayList f57102OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final SystemConversationModel f57103OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SystemConversationModel f57104OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageModelHeadType.values().length];
            try {
                iArr[MessageModelHeadType.TypeSystem.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageModelHeadType.TypeYallaTeam.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f57102OooO00o = arrayList;
        SystemConversationModel systemConversationModel = new SystemConversationModel(MessageModelHeadType.TypeSystem);
        this.f57103OooO0O0 = systemConversationModel;
        SystemConversationModel systemConversationModel2 = new SystemConversationModel(MessageModelHeadType.TypeYallaTeam);
        this.f57104OooO0OO = systemConversationModel2;
        arrayList.clear();
        arrayList.add(systemConversationModel);
        arrayList.add(systemConversationModel2);
    }
}
