package cn.sinjinsong.common.util;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtil {
    public static void save(String path, byte[] buf) throws IOException {
        FileChannel outChannel = FileChannel.open(Paths.get(path),
                StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        outChannel.write(ByteBuffer.wrap(buf));
        outChannel.close();
    }
}
