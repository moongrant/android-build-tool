package com.common.support.apm.monitor;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006\u0012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/common/support/apm/monitor/ConsecutiveEventIntGenerator;", "", "consecutiveTimes", "", "excludedElement", "onConsecutiveEventListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "", "onExcludedEventListener", "(ILjava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "currentIndex", "Ljava/lang/Integer;", "fixedLengthElementArray", "", "isLastElementAdded", "", "addElement", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ConsecutiveEventIntGenerator {
    private int currentIndex;

    @Nullable
    private final Integer excludedElement;

    @NotNull
    private final int[] fixedLengthElementArray;
    private boolean isLastElementAdded;

    @NotNull
    private final Function1<Integer, Unit> onConsecutiveEventListener;

    @Nullable
    private final Function1<Integer, Unit> onExcludedEventListener;

    /* JADX WARN: Multi-variable type inference failed */
    public ConsecutiveEventIntGenerator(int i, @Nullable Integer num, @NotNull Function1<? super Integer, Unit> onConsecutiveEventListener, @Nullable Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(onConsecutiveEventListener, "onConsecutiveEventListener");
        this.excludedElement = num;
        this.onConsecutiveEventListener = onConsecutiveEventListener;
        this.onExcludedEventListener = function1;
        this.fixedLengthElementArray = new int[i];
    }

    public final synchronized void addElement(int element) {
        Function1<Integer, Unit> function1;
        int[] iArr = this.fixedLengthElementArray;
        int length = iArr.length;
        int i = this.currentIndex;
        if (i < length) {
            if (i == length - 1) {
                boolean z = true;
                if (this.isLastElementAdded) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, 0, 1, length);
                } else {
                    this.isLastElementAdded = true;
                }
                this.fixedLengthElementArray[this.currentIndex] = element;
                Integer num = this.excludedElement;
                if (num != null && element == num.intValue()) {
                    Function1<Integer, Unit> function2 = this.onExcludedEventListener;
                    if (function2 != null) {
                        function2.invoke(Integer.valueOf(element));
                    }
                } else {
                    int[] iArr2 = this.fixedLengthElementArray;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = iArr2[i2];
                        i2++;
                        if (!(i3 == this.fixedLengthElementArray[0])) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        this.onConsecutiveEventListener.invoke(Integer.valueOf(element));
                    }
                }
            } else {
                this.currentIndex = i + 1;
                iArr[i] = element;
                Integer num2 = this.excludedElement;
                if (num2 != null && element == num2.intValue() && (function1 = this.onExcludedEventListener) != null) {
                    function1.invoke(Integer.valueOf(element));
                }
            }
        }
    }

    public /* synthetic */ ConsecutiveEventIntGenerator(int i, Integer num, Function1 function1, Function1 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, function1, (i2 & 8) != 0 ? null : function2);
    }
}
