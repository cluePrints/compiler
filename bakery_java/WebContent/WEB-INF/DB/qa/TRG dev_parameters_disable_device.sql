# 
#	����� ��������� �������, ����������� ��� ������������ ��������� (����������, ����. devices) ��������,
#	�� �� ����� �������� ��������� �� ������������ ��� ������ ���������������� ���������� (����. device_parameters)
#	� ����� ��������� ���� active=0, ���������� �� ����� ���� ������ ������������
# 

DELIMITER |
CREATE TRIGGER device_parameter_disables_device
  BEFORE UPDATE ON device_parameters FOR EACH ROW
  BEGIN
    UPDATE devices SET device_active=0 WHERE (NEW.device_parameter_active=0) AND devices.device_id=OLD.device_id;
  END;
|
DELIMITER;