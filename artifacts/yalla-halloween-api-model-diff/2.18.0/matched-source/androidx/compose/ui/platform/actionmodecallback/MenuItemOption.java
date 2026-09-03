package androidx.compose.ui.platform.actionmodecallback;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "", "id", "I", "OooO00o", "()I", "order", "OooO0O0", "Copy", "Paste", "Cut", "SelectAll", "ui_release"}, k = 1, mv = {1, 6, 0})
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);

    private final int id;
    private final int order;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            iArr[MenuItemOption.Copy.ordinal()] = 1;
            iArr[MenuItemOption.Paste.ordinal()] = 2;
            iArr[MenuItemOption.Cut.ordinal()] = 3;
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MenuItemOption(int i) {
        this.id = i;
        this.order = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: OooO0O0, reason: from getter */
    public final int getOrder() {
        return this.order;
    }
}
