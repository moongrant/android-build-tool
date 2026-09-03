package androidx.compose.foundation.text;

import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeyMappingKt {

    @NotNull
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m2589isCtrlPressedZmokQxo(((KeyEvent) obj).m2574unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo755mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m2591isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m2589isCtrlPressedZmokQxo(event)) {
                    long jM2585getKeyZmokQxo = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m775getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m776getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m777getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m774getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m2589isCtrlPressedZmokQxo(event)) {
                    long jM2585getKeyZmokQxo2 = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m775getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m776getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m777getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m774getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m779getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m773getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m769getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m768getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m2591isShiftPressedZmokQxo(event)) {
                    long jM2585getKeyZmokQxo3 = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m782getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_LEFT;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m781getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                    }
                } else if (KeyEvent_androidKt.m2588isAltPressedZmokQxo(event)) {
                    long jM2585getKeyZmokQxo4 = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo4, mappedKeys4.m769getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo4, mappedKeys4.m773getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo755mapZmokQxo(event) : keyCommand;
            }
        };
    }

    @NotNull
    public static final KeyMapping commonKeyMapping(@NotNull final Function1<? super KeyEvent, Boolean> shortcutModifier) {
        Intrinsics.checkNotNullParameter(shortcutModifier, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            @Nullable
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo755mapZmokQxo(@NotNull android.view.KeyEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (shortcutModifier.invoke(KeyEvent.m2568boximpl(event)).booleanValue() && KeyEvent_androidKt.m2591isShiftPressedZmokQxo(event)) {
                    if (Key.m2277equalsimpl0(KeyEvent_androidKt.m2585getKeyZmokQxo(event), MappedKeys.INSTANCE.m790getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (shortcutModifier.invoke(KeyEvent.m2568boximpl(event)).booleanValue()) {
                    long jM2585getKeyZmokQxo = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m770getCEK5gGoQ()) ? true : Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m780getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m787getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m788getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m767getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m789getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo, mappedKeys.m790getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m2589isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m2591isShiftPressedZmokQxo(event)) {
                    long jM2585getKeyZmokQxo2 = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m775getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m776getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m777getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m774getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m784getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m783getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m782getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m781getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo2, mappedKeys2.m780getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM2585getKeyZmokQxo3 = KeyEvent_androidKt.m2585getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m775getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m776getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m777getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m774getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m784getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m783getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m782getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m781getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m778getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m769getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m773getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m785getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m772getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m771getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m2277equalsimpl0(jM2585getKeyZmokQxo3, mappedKeys3.m786getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    @NotNull
    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
