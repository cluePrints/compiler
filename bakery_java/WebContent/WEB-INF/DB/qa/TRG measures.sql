#
# 	������ ����� ���� �������� ������ ���� � ���� ���� ���������, �� ������� �� �������
#	

DELIMITER |
DROP TRIGGER IF EXISTS before_upd_measures|
CREATE TRIGGER before_upd_measures
  BEFORE UPDATE ON measures FOR EACH ROW
  BEGIN
  	DECLARE mean FLOAT default null;
	DECLARE diff FLOAT default null;

	# �������� ������� �� ��� ������
  	SELECT sum(measure_value)/sum(1) INTO mean FROM measures
	WHERE measure_time
    	BETWEEN ADDDATE(NEW.measure_time, -14)
      	AND NEW.measure_time
  	AND measure_device_parameter=1
	AND measure_active=1
	AND measure_id<>NEW.measure_id;
	
	IF mean is not null THEN
		SELECT sqrt(sum(power(mean-measure_value, 2))) INTO diff FROM measures
		WHERE measure_time
		    	BETWEEN ADDDATE(NEW.measure_time, -14)
		      	AND NEW.measure_time
		  	AND measure_device_parameter=1
			AND measure_active=1;
		IF abs(mean-NEW.measure_value)> diff THEN
			SET NEW.measure_active=0;
		END IF;
	END IF;	
  END;
|
DELIMITER;

DELIMITER |
DROP TRIGGER IF EXISTS before_ins_measures|
CREATE TRIGGER before_ins_measures
  BEFORE INSERT ON measures FOR EACH ROW
  BEGIN
  	DECLARE mean FLOAT default null;
	DECLARE diff FLOAT default null;

	# �������� ������� �� ��� ������
  	SELECT sum(measure_value)/sum(1) INTO mean FROM measures
	WHERE measure_time
    	BETWEEN ADDDATE(NEW.measure_time, -14)
      	AND NEW.measure_time
  	AND measure_device_parameter=1
	AND measure_active=1;
	
	IF mean is not null THEN
		SELECT sqrt(sum(power(mean-measure_value, 2))) INTO diff FROM measures
		WHERE measure_time
		    	BETWEEN ADDDATE(NEW.measure_time, -14)
		      	AND NEW.measure_time
		  	AND measure_device_parameter=1
			AND measure_active=1;
		IF abs(mean-NEW.measure_value)> diff THEN
			SET NEW.measure_active=0;
		END IF;
	END IF;	
  END;
|
DELIMITER;